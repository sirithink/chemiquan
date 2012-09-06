/*
Copyright (c) 2003-2012, CKSource - Frederico Knabben. All rights reserved.
For licensing, see LICENSE.html or http://ckeditor.com/license
*/

CKEDITOR.editorConfig = function( config )
{
	// Define changes to default configuration here. For example:
	// config.language = 'fr';
	// config.uiColor = '#AADC6E';
		
	// Define changes to default configuration here. For example:
	//config.language = 'fr';//语言
	config.width = '660';//宽度
	config.height = '200';//高度
	//config.uiColor = '#AADC6E';//背景颜色
	//config.toolbar = 'Full';//有Full和Basic基本属性。也可以具体配置
	config.skin = 'kama';//假如不设置默以为kama,还有office2003和v2属性
    //config.toolbarCanCollapse = true;//工具栏是否可以被收缩
    //config.toolbarLocation = 'bottom';//工具栏的位置可选：bottom
    //config.toolbarStartupExpanded = true;//工具栏默认是否展开
    // 取消 “拖拽以改变尺寸”功能 plugins/resize/plugin.js
    //config.resize_enabled = false;
    //改变大小的最大高度
    //config.resize_maxHeight = 400;
    //改变大小的最大宽度
    config.resize_maxWidth = '660';
    //改变大小的最小高度
    //config.resize_minHeight = 200;
    //改变大小的最小宽度
    //config.resize_minWidth = 500;
	//当提交包含有此编辑器的表单时，是否自动更新元素内的数据
    //config.autoUpdateElement = true;
	/*
	config.toolbar_Full = [
		
		['Source','-','Save','NewPage','Preview','-','Templates'],
		
		['Cut','Copy','Paste','PasteText','PasteFromWord','-','Print', 'SpellChecker', 'Scayt'],
		
		['Undo','Redo','-','Find','Replace','-','SelectAll','RemoveFormat'],
		
		['Form', 'Checkbox', 'Radio', 'TextField', 'Textarea', 'Select', 'Button', 'ImageButton', 'HiddenField'],
		
		'/',
		
		['Bold','Italic','Underline','Strike','-','Subscript','Superscript'],
		
		['NumberedList','BulletedList','-','Outdent','Indent','Blockquote'],
		
		['JustifyLeft','JustifyCenter','JustifyRight','JustifyBlock'],
		
		['Link','Unlink','Anchor'],
		
		['Image','Flash','Table','HorizontalRule','Smiley','SpecialChar','PageBreak'],
		
		'/',
		
		['Styles','Format','Font','FontSize'],
		
		['TextColor','BGColor']
		
	];
	*/

};
