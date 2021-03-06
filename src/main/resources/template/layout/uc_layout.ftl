[#assign nav="uc" /]
<!DOCTYPE html>
<html lang="zh-CN" xmlns="http://www.w3.org/1999/html">
<head>
    <link href="[@img src='favicon.ico'/]" rel="icon" type="image/x-icon"/>
    <link href="[@img src='favicon.ico'/]" rel="shortcut icon" type="image/x-icon"/>
    [#include "include/meta.ftl" /]
        <title>${title}</title>
    [#include "include/link_top.ftl" /]
    [@css href="css/process.css" /]
    [@css href="css/accountcenter.css" /]
    [@css href="css/invite.css" /]
    [@css href="lib/jcrop/css/jquery.Jcrop.css" /]
    [#--[@css href="css/mate/reset.css" /]--]
    [@css href="css/mate/common.css" /]

    [@stylesheet /]
    <script>
        var ctx = "${ctx}";
        var urlbase = "${ctx}";
        var staticUrl = "${ctx}";
    </script>
</head>
<body>
<div id="wrapper">
    [#-- 页眉 --]
    [#include "include/header.ftl" /]
    [#--内容--]
    <div class="layout clearfix">
        [#-- 边导航 --]
        [#include "uc/sidebar.ftl" /]

        <div class="[#if module=='point']memberContentNoPadding[#else]memberContent[/#if]" id="${memberContentId!''}">
            [@body /]
        </div>
    </div>
    [#-- Footer 页脚 --]
    [#include "include/footer.ftl" /]
</div>
</body>
    [#include "include/script_top.ftl" /]
    [#include "include/script_bottom.ftl" /]
    [@js src="lib/jquery/validate/jquery.validate.min.js,
              lib/jquery/validate/jquery.validate.common.min.js,
              lib/jquery/validate/jquery.validate.method.min.js" /]
    [@js src="lib/tools/rsa/jsbn.min.js,
        lib/tools/rsa/prng4.min.js,
        lib/tools/rsa/rng.min.js,
        lib/tools/rsa/rsa.min.js,
        lib/tools/base/base64.min.js" /]
    <script type="text/javascript">
        var modules = "${modules}", exponent = "${exponent}";
    </script>
    [@js src="js/user/uc.js" /]
    [@js src="js/util/siderbar.js"/]
    [@js src="lib/jcrop/js/jquery.Jcrop.js"/]
    [@js src="js/user/user.avatar.js" /]
    [@js src="js/index/index.js" /]
    [@script /]
</html>