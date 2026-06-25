function reportIncident(){

fetch("/incidents",{

method:"POST",

headers:{
"Content-Type":"application/json"
},

body:JSON.stringify({

title:title.value,
description:description.value,
severity:severity.value,
latitude:window.lat || 0,
longitude:window.lng || 0

})

})

}

function addResource(){

fetch("/resources",{

method:"POST",

headers:{
"Content-Type":"application/json"
},

body:JSON.stringify({

name:rname.value,
type:rtype.value,
status:"Available"

})

})

}

function addVolunteer(){

fetch("/volunteers",{

method:"POST",

headers:{
"Content-Type":"application/json"
},

body:JSON.stringify({

name:vname.value,
skill:vskill.value,
availability:"Available"

})

})

}

function createAlert(){

fetch("/alerts",{

method:"POST",

headers:{
"Content-Type":"application/json"
},

body:JSON.stringify({

message:alertmsg.value,
severity:"High"

})

})

}