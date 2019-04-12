tab = [];
function affichageLog(){
	var typeLog = document.querySelector("input[name='typeLog']:checked").value;
	var myHeaders = new Headers();
	var listLogsSelect;
	var listId = [];
	var listElement = [];

	var myInit = {
		method: 'POST',
		header: myHeaders
	};

	var myRequest = new Request('http://' + document.getElementById('url').value + ':' + document.getElementById('port').value + '/api/logs/' + typeLog, myInit);

    fetch(myRequest, myInit)

	.then(function(response) {
		return response.json();
	})
	.then(function(myLogs) {
		var listLogs=document.getElementById('spanLogs');
		var detailLog = document.getElementById('spanDetail');
		while(listLogs.firstChild){
			listLogs.removeChild(listLogs.firstChild);
		}
		while(detailLog.firstChild){
        	detailLog.removeChild(detailLog.firstChild);
        }

		for(var i=0; i < myLogs.length; i++){
			let p = document.createElement('div');
			let p2 = document.createElement('p');

			p.id=i;

			p2.innerText = myLogs[i].msg;
            p.innerText = myLogs[i].id + ': ';

			p.addEventListener("click", function (event) {
				describeLog(myLogs[p.id]);
				//console.log(p.value);
			});


			p.appendChild(p2);
            listLogs.appendChild(p);


			tab.push(p);
		}
	})
//	.catch(err => {
//  		console.log(err);
//	})
	;

	return false;
}