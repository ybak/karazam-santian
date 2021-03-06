[@nestedscript]
    [@js src="ueditor/ueditor.config.js" /]
    [@js src="ueditor/ueditor.all.js" /]
    [@js src="js/admin/mall/goods/list.js" /]
[/@nestedscript]
[@insert template="admin/layout/default_layout" title="商品管理"]
<div id="tb" style="padding:5px;height:auto">
    <div>
        <form id="searchFrom" style="margin-bottom: 5px;">
            名称:<input type="text" name="filter_LIKES_name" class="easyui-textbox"
                       data-options="width:150,prompt: '请输入名称'"/>
            [#--别名:<input type="text" name="filter_LIKES_alias" class="easyui-textbox"
                       data-options="width:150,prompt: '请输入别名'"/>--]
            <span class="toolbar-item dialog-tool-separator"></span>
            <a href="javascript:query()" class="easyui-linkbutton" iconCls="fa fa-search-minus" [#--onclick="query()"--]>查询</a>
        </form>
		[@shiro.hasPermission name="mall:goods:add"]
            <a href="javascript:create()" class="easyui-linkbutton" iconCls="fa fa-plus-square"  [#--onclick="create()"--]>新增</a>
		[/@shiro.hasPermission]
		[@shiro.hasPermission name="mall:goods:update"]
            <a href="javascript:update()" class="easyui-linkbutton" iconCls="fa fa-edit" [#--onclick="update()"--]>修改</a>
		[/@shiro.hasPermission]
		[@shiro.hasPermission name="mall:goods:delete"]
            <a href="javascript:deleteCategory()" class="easyui-linkbutton" iconCls="fa fa-remove" [#--onclick="deleteCategory()"--]>删除</a>
		[/@shiro.hasPermission]
        [#--[@shiro.hasPermission name="mall:goods:queryarticle"]
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="fa fa-eye"  onclick="queryGoods()">查看商品</a>
        [/@shiro.hasPermission]--]

    </div>
</div>
<table id="datagrid"></table>
<div id="dialog"></div>
[/@insert]