<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>角色管理</title>
<%@include file="/link/link.jsp"%>
</head>
<body class="easyui-layout">
	<div data-options="region:'center',title:'角色列表',iconCls:'icon-ok'">
		<table id="roleid"
			data-options="toolbar:'#toolbar',loadMsg:'正在加载数据...',">
			<thead>
				<tr>
					<th data-options="field:'id' , hidden:'true'">id</th>
					<th data-options="field:'roleName',align:'center'" width="150">角色名称</th>
					<th data-options="field:'code',align:'center'" width="150">角色代码</th>
					<th data-options="field:'remark',align:'center'" width="150">备注</th>
				</tr>
			</thead>
		</table>
		<div id="toolbar" style="padding: 5px; height: auto">
			<div style="padding: 5px;">
				<font>角色名称：</font> <input id="rn" name="roleName"
					class="easyui-validatebox" type="text" style="width: 200px;" /> <a
					href="javascript:void(0);" class="easyui-linkbutton"
					iconCls="icon-search" onclick="findRole()">查询</a>
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
	<!--角色窗口 -->
	<div id="roleWindow" class="easyui-window" title="角色信息"
		data-options="modal:true,minimizable:false,closed:true,iconCls:'icon-edit'"
		style="width: 400px; height: 320px; padding: 10px;">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'center'" style="padding: 10px;">
				<form id="form" method="post">
					<table align="center" width="100%">
						<tr>
							<td>角色名称：</td>
							<td><input type="hidden" name="id" id="rid" /> <input
								id="roleName" name="roleName" class="easyui-validatebox"
								type="text" data-options="required:false" style="width: 150px;" />
							</td>
						</tr>
						<tr>
							<td>角色代码：</td>
							<td><input id="code" name="code" class="easyui-validatebox"
								type="text" data-options="required:false" style="width: 150px;" />
							</td>
						</tr>
						<tr>
							<td>备注：</td>
							<td><textarea id="remark" name="remark"
									style="width: 150px;" class="easyui-validatebox"></textarea></td>
						</tr>
					</table>
				</form>
			</div>
			<div data-options="region:'south',border:false"
				style="text-align: right; padding: 5px 0 0;">
				<a href="javascript:void(0)" class="easyui-linkbutton"
					data-options="iconCls:'icon-save'" onclick="saveRole()">保存</a> <a
					href="javascript:void(0)" class="easyui-linkbutton"
					data-options="iconCls:'icon-cancel'"
					onclick="$('#roleWindow').window('close')">取消</a>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
$(function(){
	findRole();
});
//打开新增角色窗口
function showroleWindow(){
	$('#form').form('clear');
	$("#roleWindow").window("open");
}
//打开修改角色窗口
function editRecord(){
	record = $("#roleid").datagrid("getSelected");
	if(record==null){
		$.messager.alert("系统提示","请选择记录!","warning");
		return;
	}
	$("#rid").val(record.id);
	$("#roleName").val(record.roleName);
	$("#code").val(record.code);
	$("#remark").val(record.remark);
	$("#roleWindow").window("open");
}
//保存角色
function saveRole(){
	var name = $("#roleName").val();
	if(name == ""){
		$.messager.alert("系统提示","请填写角色名称","warning");
		return;
	}
	var code = $("#code").val();
	if(code == ""){
		$.messager.alert("系统提示","请填写角色代码","warning");
		return;
	}
	var options ={
			url:"${app}/admin/json/saveRole",
			success : function(data) {
				if(checkData(data)){
					$("#roleWindow").window('close');
					$("#rn").val('');
					findRole();
				}
			}
		};
	$("#form").ajaxSubmit(options);		
	//清除选中行
	$('#roleid').datagrid('clearSelections');
}
//删除角色
function deleteRole(){
	var record = $('#roleid').datagrid('getSelected');
	if(record==null){
		$.messager.alert("系统提示","请选择记录!","warning");
		return;
	}
	$.messager.confirm('系统提示', '确定要删除吗?', function(r){
		if (r){
			$.getJSON("${app}/admin/json/deleteRole?roleId="+record.id,function(data){
				if(checkData(data)){
					findRole();
				}
			});			
		}
	});
	$('#roleid').datagrid('clearSelections');
}
//查询角色
function findRole(){
	var name = $("#rn").val();
	 $('#roleid').datagrid({
	        height: 'auto',  
	        nowrap: false,  
	        striped: true,  
	        border: true,  
	        collapsible:false,//是否可折叠的  
	        fit: true,//自动大小  
	        url:'${app}/admin/json/findRoleList?roleName='+name,  
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
	    var p = $('#roleid').datagrid('getPager');  
	    $(p).pagination({  
	        beforePageText: '第',//页数文本框前显示的汉字  
	        afterPageText: '页    共 {pages} 页',  
	        displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录',  
	    });  
	    $('#roleid').datagrid('clearSelections');
}
</script>
</html>