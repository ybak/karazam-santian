<div>
    <form id="addForm">
        <table id="basicInfo" class="tbform">
            <tr>
                <td>标题：</td>
                <td>
                    <input id="title" name="title" class="easyui-textbox" data-options="validType:'chsEngNum',required:'required'"/>
                    <input id="action" name="action" value="add" hidden/>
                </td>
            </tr>
            <tr>
                <td>启动页上传：</td>
                <td>
                    <div class="input-group">
                        <input id="path" name="path" class="easyui-textbox" />
                        <label class="input-group-addon" onclick="uploadBanner('path');">上传</label>
                    </div>
                </td>
            </tr>
            <tr>
                <td>链接地址：</td>
                <td>
                    <input id="url" name="url" class="easyui-textbox" data-options="validType:'url'"/>
                </td>
            </tr>
            <tr>
                <td>开始时间：</td>
                <td>
                    <input id="startDate" name="startDate" class="easyui-datebox" data-options="required:'required'"/>
                </td>
            </tr>
            <tr>
                <td>结束时间：</td>
                <td>
                    <input id="endDate" name="endDate" class="easyui-datebox" data-options="required:'required'" />
                </td>
            </tr>
            <tr>
                <td>页面类型：</td>
                <td>
                    <select id="isWelcomePage" class="easyui-combobox" name="isWelcomePage">
                        <option value="true">引导页</option>
                        <option value="false">启动页</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>备注：</td>
                <td>
                    <textarea id="cont" name="cont" class="form-control kind-editor" cols="10" rows="5"></textarea>
                </td>
            </tr>
        </table>
    </form>
</div>
