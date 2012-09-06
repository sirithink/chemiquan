//广告JS代码
function showGGOver(id,num,length){
	for(var i = 1; i <= length; i++){
		$('#jwlgg1_'+i).css('display','none');
	}
	$('#jwlgg1_'+num).css('display','block');
	$('#'+id).attr('src','images/0'+num+'.jpg');
}

function showTagClick(num,length,name,classname){
	for(var i = 1; i <= length; i++){
		$('#'+name+'_li'+i).removeClass(classname);
		$('#'+name+'_'+i).css('display','none');
	}
	$('#'+name+'_li'+num).addClass(classname);
	$('#'+name+'_'+num).css('display','block');
	
}