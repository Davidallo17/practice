var resources = document.getElementById("resources");

var method = document.getElementById("method");

var url = document.getElementById("url");
var response = document.getElementById("response");
var status = document.getElementById("status");
var submit = document.getElementById("submit");

var first = document.getElementById("first");
var last = document.getElementById("last");




submit.addEventListener('click',function(){
    var data={
        first:firstUsed,
        last:lastUsed
    };
    var urlUsed= url.value;
    var firstUsed=first.value;
    var lastUsed =last.value;
    var resourceUsed =resources.options[resources.selectedIndex].value;
    var methodUsed = method.options[method.selectedIndex].value;
    console.log(resourceUsed)

    console.log(urlUsed)
    if(resourceUsed=="Javascript" && methodUsed=="GET"){
        try{
            XMLGet(urlUsed);
            console.log("submit GET from Javascript")
        }catch(e){
            console.log(e)
        }
        
    }else if(resourceUsed=="jQuery" && methodUsed=="GET"){
        console.log("submit GET from JQuery")
        $.getJSON(urlUsed,function(data){
            console.log(JSON.stringify(data))
            response.innerHTML= JSON.stringify(data)
        })

        // $.ajax({
        //     url:urlUsed,
        //     method:"GET"
        // }).done(function(data){
        //     console.log(JSON.stringify(data))
        //     response.innerHTML= JSON.stringify(data)
        // })

    }else if(resourceUsed=="Fetch" && methodUsed=="GET")
    {
        fetch(urlUsed).then(responses=>{return responses.json()}).then(output=>{
            console.log(output)
            response.innerHTML= output
        })
    }else if(resourceUsed=="Javascript" && methodUsed=="POST")
    {
            var data=`first=${firstUsed}&last=${lastUsed}`;
            XMLPost(urlUsed,data);
            console.log("submit POST from Javascript")
        
    }else if (resourceUsed=="jQuery" && methodUsed=="POST")
    {
        
        $.post(urlUsed,{
            first:firstUsed,
            last:lastUsed
        }).done(function(data){
            console.log(data)
            response.innerHTML=data.first
        })

    }else if (resourceUsed=="Fetch" && methodUsed=="POST"){
        fetch(urlUsed,{
            method:"POST",
            headers:{'Content-Type':'application/x-www-form-urlencoded;charset=UTF-8'},
            body:data
        }).then(response=>{return response.json}).then(data=>{console.log(JSON.stringify(data))}).catch(e=>{console.log(e)})

    }
});




function XMLGet(url){
    var xhr = new XMLHttpRequest();
    var html =" ";
    xhr.onreadystatechange = function(){
        if(xhr.status==200 && xhr.readyState==4)
        {
            var MyObj = JSON.parse(xhr.response);
           
            html+=xhr.response;
            console.log(MyObj.value)
            console.log(xhr.status)
        }
        response.innerHTML= html
        status.innerHTML=xhr.status;
    }
    
    
    xhr.open("GET",url,true);
    xhr.send();
}

function XMLPost(url,data){
    var xhr = new XMLHttpRequest();
    var html =" ";
    xhr.onreadystatechange = function(){
        if(xhr.status==200 )
        {
            var MyObj = xhr.responseText;
        }
     
    }
    xhr.open("POST",url,true);
    xhr.send(data);
   
}

// $.ajax({
//     method:"GET",
//     url:url
// })