function affichageLog(){
	var typeLog = document.querySelector("input[name='typeLog']:checked").value;
	var myHeaders = new Headers();

	var myInit = {
		method: 'POST',
		header: myHeaders
//		mode: 'no-cors'
	};

	var myRequest = new Request('http://localhost:8080/api/logs/' + typeLog, myInit);


    fetch(myRequest, myInit)
	// .then(function(response){ //response => response.json())
	// .then(response => response.json())
	.then(function(response) {
		return response.json();
	})
	.then(function(myLogs) {
		//var codeHTML = "";
		var listLogs=document.getElementById('spanLogs');
		var p = document.createElement('p');

		/*p.innerText = 'truyugsd';
		p.classList.add('test');
		listLogs.appendChild(p);*/
		for(var i=0; i < myLogs.length; i++){
			p.innerText = myLogs[i].id + ': ' + myLogs[i].contentLog;
			listLogs.appendChild(p);
			//codeHTML +='<p>' + myLogs[i].id + ': ' + myLogs[i].contentLog + '</p><br/>';
			
		}
		//listLogs.innerHTML= codeHTML;
	})
//	.catch(err => {
//  		console.log(err);
//	})
	;

	return false;
}