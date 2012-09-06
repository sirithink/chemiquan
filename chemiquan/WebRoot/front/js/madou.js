function showGuanZhuOver(id){
	$('.'+id).children('ul').css('display','block');
}

function showGuanZhuOut(id){
	$('.'+id).children('ul').css('display','none');
}

function showGGOver(id,num){
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




