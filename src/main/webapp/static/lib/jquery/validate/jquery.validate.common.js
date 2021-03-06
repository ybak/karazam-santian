/*
 * Copyright 2014-2015 klzan.com. All rights reserved.
 * Support: http://www.klzan.com
 *
 * JavaScript - jQuery Validate Common
 * Version: 3.0
 */

$().ready(function() {
	
	// 验证消息
	if($.validator != null) {
		$.extend($.validator.messages, {
		    required: "必填",
			email: "邮箱格式错误",
			url: "网址格式错误",
			date: "日期格式错误",
			dateISO: "日期格式错误",
			pointcard: "信用卡格式错误",
			number: "必须为数字",
			digits: "必须为零或正整数",
			minlength: $.validator.format("长度不允许小于{0}"),
			maxlength: $.validator.format("长度不允许大于{0}"),
			rangelength: $.validator.format("长度必须在{0}-{1}之间"),
			min: $.validator.format("不允许小于{0}"),
			max: $.validator.format("不允许大于{0}"),
			range: $.validator.format("必须在{0}-{1}之间"),
			accept: "后缀错误",
			equalTo: "两次输入不一致",
			remote: "输入错误",
			decimal: "超出范围值",
			pattern: "格式错误",
			extension: "文件格式错误"
		});
		
		$.validator.setDefaults({
			errorClass: "errorMessage",
			ignore: ".ignore",
			ignoreTitle: true,
			errorPlacement: function(error, element) {
				error.appendTo(element.closest("div.form-group"));
			},
			highlight: function(element) {
				$(element).closest("div.form-group").addClass("fieldError");
			},
			unhighlight: function(element) {
				var $element = $(element);
				if(!$element.hasClass("ignore")) {
					$element.closest("div.form-group").removeClass("fieldError");
				}
			},
			submitHandler: function(form) {
				$(form).find(":submit").prop("disabled", true);
				form.submit();
			}
		});
		
	}
	
});