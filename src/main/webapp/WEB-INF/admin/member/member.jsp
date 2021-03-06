<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册用户管理</title>
<%@include file="/link/link.jsp"%>
</head>
<body class="easyui-layout">
	<div data-options="region:'center',title:'用户列表',iconCls:'icon-ok'">
		<table id="memberid"
			data-options="toolbar:'#toolbar',loadMsg:'正在加载数据...',">
			<thead>
				<tr>
					<th data-options="field:'id',align:'center'" width="30">id</th>
					<th data-options="field:'avatar' , hidden:'true'">avatar</th>
					<th data-options="field:'jobYear' , hidden:'true'">avatar</th>
					<th data-options="field:'coreCapacityId' , hidden:'true'">coreCapacityId</th>
					<th data-options="field:'mobile',align:'center'" width="100">手机号</th>
					<th data-options="field:'nickName',align:'center'" width="100">昵称</th>
					<th data-options="field:'gender',align:'center'" width="50">性别</th>
					<th data-options="field:'birthday',align:'center'" width="90">生日</th>
					<th data-options="field:'companyName',align:'center'" width="100">公司</th>
					<th data-options="field:'jobName',align:'center'" width="100">职位</th>
					<th data-options="field:'jobYearStr',align:'center'" width="100">入职时间</th>
					<th data-options="field:'coreCapaciyuName',align:'center'"
						width="120">核心能力</th>
					<th data-options="field:'statusStr',align:'center'" width="50">状态</th>
					<th data-options="field:'createAt',align:'center'" width="120">注册时间</th>
				</tr>
			</thead>
		</table>
		<div id="toolbar" style="padding: 5px; height: auto">
			<div style="padding: 5px;">
				<font>昵称：</font> <input id="nn" name="nickname"
					class="easyui-validatebox" type="text" style="width: 150px;" /> <font>手机号：</font>
				<input id="mb" name="mobile" class="easyui-validatebox" type="text"
					style="width: 150px;" /> <a href="javascript:void(0);"
					class="easyui-linkbutton" iconCls="icon-search"
					onclick="findMember()">查询</a>
			</div>
			<div>
				<c:forEach items="${buttonList}" var="button">
					<a href="javascript:void(0);" class="easyui-linkbutton"
						iconCls="icon-${button.icon}" plain="true"
						onclick="${button.function}">${button.name}</a>
				</c:forEach>
			</div>
		</div>
	</div>
	<!--用户窗口 -->
	<div id="memberWindow" class="easyui-window" title="用户信息"
		data-options="modal:true,minimizable:false,closed:true,iconCls:'icon-edit'"
		style="width: 450px; height: 500px; padding: 10px;">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'center'" style="padding: 10px;">
				<form id="form" method="post">
					<table align="center" width="100%">
						<tr>
							<td></td>
							<td>
								<div id="imgdiv">
									<img id="imgShow" width="100" height="100" />
								</div> <input type="file" name="file" id="headFile" />
							</td>
						</tr>
						<tr>
							<td>手机号：</td>
							<td><input type="hidden" name="memberId" id="uid" /> <input
								id="mobile" name="mobile" class="easyui-validatebox" type="text"
								data-options="required:false" style="width: 150px;" /></td>
						</tr>
						<tr>
							<td>密码：</td>
							<td><input id="password" name="password"
								class="easyui-validatebox" type="text"
								data-options="required:false" style="width: 150px;" /></td>
						</tr>
						<tr>
							<td>昵称：</td>
							<td><input id="nickname" name="nickName"
								class="easyui-validatebox" type="text"
								data-options="required:false" style="width: 150px;" /></td>
						</tr>
						<tr>
							<td>性别：</td>
							<td><select class="easyui-combobox" id="gender"
								data-options="editable:false" name="gender"
								style="width: 150px;">
									<option value="男">男</option>
									<option value="女">女</option>
							</select></td>
						</tr>
						<tr>
							<td>生日：</td>
							<td><input id="birthday" class="easyui-datebox"
								data-options="formatter:myformatter,parser:myparser,editable:false" />
							</td>
						</tr>
						<tr>
							<td>公司：</td>
							<td><input id="companyName" name="companyName"
								class="easyui-validatebox" type="text"
								data-options="required:false" style="width: 150px;" /></td>
						</tr>
						<tr>
							<td>职位：</td>
							<td><input id="jobName" name="jobName"
								class="easyui-validatebox" type="text"
								data-options="required:false" style="width: 150px;" /></td>
						</tr>
						<tr>
							<td>入职时间：</td>
							<td><input id="jobYear" name="jobYear"
								class="easyui-validatebox" type="text"
								data-options="required:false" style="width: 150px;" /></td>
						</tr>
						<tr>
							<td>核心能力：</td>
							<td><input id="coreCapacityId" class="easyui-combobox"
								name="coreCapacityId" style="width: 155px" /></td>
						</tr>
					</table>
				</form>
			</div>
			<div data-options="region:'south',border:false"
				style="text-align: right; padding: 5px 0 0;">
				<a href="javascript:void(0)" class="easyui-linkbutton"
					data-options="iconCls:'icon-save'" onclick="saveUser()">保存</a> <a
					href="javascript:void(0)" class="easyui-linkbutton"
					data-options="iconCls:'icon-cancel'"
					onclick="$('#memberWindow').window('close')">取消</a>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
$(function(){
	findMember();
});
//打开新增会员窗口
function showmemberWindow(){
	$('#form').form('clear');
	$.getJSON("${app}/admin/json/findDictByCode?code=CORECAPACITY",function(data){
		$('#coreCapacityId').combobox({
			data:data,
            valueField:'id', 
            textField:'value',
            editable:false,
            onLoadSuccess: function () { //加载完成后,设置选中第一项
            	var val = $(this).combobox("getData");
                for (var item in val[0]) {
                    if (item == "id") {
                        $(this).combobox("select", val[0][item]);
                    }
                }
            }
        });
	});
	$("#imgdiv").attr("src","");
	$("#mobile").removeAttr("readonly");
	$("#password").removeAttr("readonly");
	new uploadPreview({ UpBtn: "headFile", DivShow: "imgdiv", ImgShow: "imgShow" });
	$('#gender').combobox("select","男");
	$("#memberWindow").window("open");
}
//打开修改会员窗口
function editRecord(){
	record = $("#memberid").datagrid("getSelected");
	if(record==null){
		$.messager.alert("系统提示","请选择记录!","warning");
		return;
	}
	$.getJSON("${app}/admin/json/findDictByCode?code=CORECAPACITY",function(data){
		$('#coreCapacityId').combobox({
			data:data,
            valueField:'id', 
            textField:'value',
            editable:false,
            onLoadSuccess: function () { //加载完成后,设置选中第一项
            	var val = $(this).combobox("getData");
                for (var item in val[0]) {
                    if (item == "id") {
                        $(this).combobox("select", record.coreCapacityId);
                    }
                }
            }
        });
	});
	$("#uid").val(record.id);
	$("#nickname").val(record.nickName);
	$("#mobile").val(record.mobile);
	$("#mobile").attr("readonly","readonly");
	$("#password").attr("readonly","readonly");
	$('#gender').combobox("select",record.gender);
	$("#birthday").datebox("setValue",record.birthday);
	$("#companyName").val(record.companyName);
	$("#jobName").val(record.jobName);
	$("#jobYear").val(record.jobYear);
	$("#imgShow").attr("src",record.avatar);
	new uploadPreview({ UpBtn: "headFile", DivShow: "imgdiv", ImgShow: "imgShow" });
	$("#memberWindow").window("open");
}
//保存会员
function saveUser(){
	var mobile = $("#mobile").val();
	if(mobile == ""){
		$.messager.alert("系统提示","请填写手机号","warning");
		return;
	}
	var code = $("#code").val();
	if(code == ""){
		$.messager.alert("系统提示","请填写会员代码","warning");
		return;
	}
	
	var re = /^[0-9]+.?[0-9]*$/;
	var jobYear = $("#jobYear").val();
	if(jobYear == ""){
		$.messager.alert("系统提示","请填写入职时间","warning");
		return;
	}
	if(!re.test(jobYear)){
		$.messager.alert("系统提示","入职时间只能为数字","warning");
		return;
	}
	var options ={
			url:"${app}/admin/json/saveUserInfo",
			success : function(data) {
				if(checkData(data)){
					$("#memberWindow").window('close');
					$("#rn").val('');
					findMember();
				}
			}
		};
	$("#form").ajaxSubmit(options);		
	//清除选中行
	$('#memberid').datagrid('clearSelections');
}
//修改状态
function updateStatus(){
	var record = $('#memberid').datagrid('getSelected');
	if(record==null){
		$.messager.alert("系统提示","请选择记录!","warning");
		return;
	}
	$.messager.confirm('系统提示', '确定要(禁用/启用)吗?', function(r){
		if (r){
			$.getJSON("${app}/admin/json/updateMemberStatus?userId="+record.id,function(data){
				if(checkData(data)){
					findMember();
				}
			});			
		}
	});
	$('#memberid').datagrid('clearSelections');
}
//查询会员
function findMember(){
	var name = $("#nn").val();
	var mobile = $("#mb").val();
	 $('#memberid').datagrid({
	        height: 'auto',  
	        nowrap: false,  
	        striped: true,  
	        border: true,  
	        collapsible:false,//是否可折叠的  
	        fit: true,//自动大小  
	        url:'${app}/admin/json/findMemberList?mobile='+mobile+'&nickname='+name,  
	        remoteSort:false, 
	        idField:'id',  
	        singleSelect : true,//是否单选  
			selectOnCheck: true,
			checkOnSelect: true,
			fitColumns: true, 
	        pagination:true,//分页控件  
	        pageSize:30,//设置分页默认条数
		    pageList: [30,50,100,150], 
	        rownumbers:true,//行号  
	        onLoadError:function(){
	        	$.messager.alert("系统提示","加载数据失败！","warning");
			}
	    });  
	 	//设置分页控件  
	    var p = $('#memberid').datagrid('getPager');  
	    $(p).pagination({  
	        beforePageText: '第',//页数文本框前显示的汉字  
	        afterPageText: '页    共 {pages} 页',  
	        displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',  
	    });  
	    $('#memberid').datagrid('clearSelections');
}
</script>
</html>