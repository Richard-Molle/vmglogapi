function describeLog(log){
    var span = document.getElementById('spanDetail');

    while(span.firstChild){
    	span.removeChild(span.firstChild);
    }

    var p = document.createElement('label');

    var id = document.createElement('p');
    id.innerText = "id: " + log.id;
    p.appendChild(id);
    var dateTime = document.createElement('p');
    dateTime.innerText = "dateTime: " + log.datetime;
    p.appendChild(dateTime);
    var host = document.createElement('p');
    host.innerText = "host: " + log.host;
    p.appendChild(host);
    var facility = document.createElement('p');
    facility.innerText = "facility: " + log.facility;
    p.appendChild(facility);
    var level = document.createElement('p');
    level.innerText = "level: " + log.level;
    p.appendChild(level);
    var tag = document.createElement('p');
    tag.innerText = "tag: " + log.tag;
    p.appendChild(tag);
    var program = document.createElement('p');
    program.innerText = "program: " + log.program;
    p.appendChild(program);
    var msg = document.createElement('p');
    msg.innerText = "message: " + log.msg;
    p.appendChild(msg);

    span.appendChild(p);

}