// JavaScript Document
function printDiv(divName){
	var conteudo = document.getElementById(divName).innerHTML;
	var tela_impressao = window.open('about:blank');
	tela_impressao.document.write(conteudo);
	tela_impressao.window.print();
	tela_impressao.window.close();
}

window.onload = function(){
	bot01= document.getElementById("bot01");
	
	bot01.onclick = function(){
		printDiv('printableArea');
	};
};
