<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>中标上限</title>
	</head>
	<body>
		<#-- 表单查询 DIV 开始 -->
		<div id="searchPanel" class="easyui-panel" title="退保证金"
			style="text-align:left;width:auto;background: #fafafa;" collapsible="false"
			minimizable="false" maximizable="false" data-options="fit:true">
			<#-- 表单查询 table 开始 -->
			<div class="grid-toolbar">
				<table class="tblContent" style="width:100%;">
					<tr>
						<td class="tdLeft">
							<span></span>
							<a href="javascript:void(0);" class="easyui-linkbutton"
								data-options="iconCls:'icon-search'" onclick="doSearch()">修改</a>
						</td>
					</tr>
				</table>
			</div>
			<div id="tt" class="grid-auto">
			</div>
		</div>
		
		<div id="dlg" class="easyui-dialog" title="Basic Dialog" data-options="iconCls:'icon-save'" style="width:400px;height:200px;padding:10px">
	        请输入中标次数上限值 <input >
	         <input type="button" name="确认"> 
			<input type="button" name="取消">
	    </div>
		<script type="text/javascript" src="${resRoot}/js/bidLimitRecord/bidLimitRecord.js"></script>
	</body>
</html>