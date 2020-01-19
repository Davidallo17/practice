
var search = document.querySelector('#search');
var searchbtn = document.querySelector('#searchbtn');
var load = document.querySelector("#load")

var pokemon_name = document.querySelector("#pokemon-name")
var pokemon_img = document.querySelector("#pokemon-img")
var pokemon_type = document.querySelector("#pokemon-type")
var pokemon_id = document.querySelector("#pokemon-id")

var pokemon_TotalStat = document.querySelector("#pokemon-TotalStat")
var pokemon_HPStat = document.querySelector("#pokemon-HPStat")
var pokemon_AttStat = document.querySelector("#pokemon-AttStat")
var pokemon_DefStat = document.querySelector("#pokemon-DefStat")
var pokemon_SPAStat = document.querySelector("#pokemon-SPAStat")
var pokemon_SPDStat = document.querySelector("#pokemon-SPDStat")
var pokemon_SPEStat = document.querySelector("#pokemon-SPEStat")

var progress_hp = document.querySelector(".progress-hp");
var progress_attack = document.querySelector(".progress-attack");
var progress_defence = document.querySelector(".progress-defence");
var progress_spa = document.querySelector(".progress-spa");
var progress_spd = document.querySelector(".progress-spd");
var progress_spe = document.querySelector(".progress-spe");

var Abilities = document.querySelector("#Abilities");
var Hidden_Abilities = document.querySelector("#Hidden_Abilities");
var moves = document.querySelector("#moves");


const fetchPokemon=()=>{
    const promise =[];
    for(let i=1;i<808;i++)
    {
        var url = `https://pokeapi.co/api/v2/pokemon/${i}`;
        promise.push(fetch(url).then(response=>{return response.json()}))
    }

    Promise.all(promise).then((results)=>{
        
        const pokemon = results.map((data)=>({
             id:data.id,
             name:data.name,
             sprite:data.sprites['front_default']
         }))
         console.log(pokemon)
      display(pokemon);
            
           
    })
    .catch(error=>console.log(error))
}


const display = (pokemon)=>{
    const pokemonHTMLString = pokemon.map((poke)=>(
        `<li class="list-group-item"><span class="pokemon-name">${poke.name}</span></li>`
    )).join('')
        load.innerHTML=pokemonHTMLString;
}
fetchPokemon();



$(load).click(function(e) {
    pokemon_type.innerHTML=" ";
    Abilities.innerHTML =" ";
    Hidden_Abilities.innerHTML=" ";
    moves.innerHTML=" ";
    var txt = $(e.target).text();
    var pokemon_url = `https://pokeapi.co/api/v2/pokemon/${txt}`;
    console.log(pokemon_url);


    fetch(pokemon_url).then(response=>{return response.json()}).then((results)=>{
        console.log(results)
        //Pokemon ID
        pokemon_id.innerHTML=results.id;
        //Pokemon Name
        pokemon_name.innerHTML=results.species.name;
        //Pokemon Image
        $(pokemon_img).attr("src",results.sprites.front_default);
        
        //Pokemon Type
        for(var x in results.types)
        {pokemon_type.innerHTML+="<h3 class='pokemon-type'>"+results.types[x].type.name +"</h3>";}


        //Pokemon Abilities

        for(var x in results.abilities)
        {   
            var y=x;
            if(results.abilities[x].is_hidden==false)
            {
            Abilities.innerHTML+="<h4 class='pokemon-abilities'>"+results.abilities[x].ability.name +"</h4>";
            }

            if(results.abilities[x].is_hidden==true)
            {
                Hidden_Abilities.innerHTML+="<h4 class='pokemon-abilities'>"+results.abilities[x].ability.name +"</h4>";
            }
        }
        //Pokemon Moves
        for(var x in results.moves)
        {moves.innerHTML+="<h3 class='pokemon-move'>"+results.moves[x].move.name +"</h3>";}

        //Pokemon HP 
        var hp = (results.stats[5].base_stat/255)*100;
        $(progress_hp).attr("style",`width:${hp}%`)

        if(50 >= results.stats[5].base_stat )
        {
            $(progress_hp).css("background-color", "#cb2d3e"); //red
        }
        if(50< results.stats[5].base_stat )
        {
            $(progress_hp).css("background-color", "#f79d00");//yellow
        }
        if(81< results.stats[5].base_stat )
        {
            $(progress_hp).css("background-color", "#a8e063");//light green
        }
         if(120<results.stats[5].base_stat )
        {
            $(progress_hp).css("background-color", "#56ab2f");//green
        } 
        if(160<results.stats[5].base_stat)
        {
            $(progress_hp).css("background-color", "#3a7bd5");//blue
        }
       
        var att = (results.stats[4].base_stat/255)*100;
        $(progress_attack).attr("style",`width:${att}%`)
        if(50 >= results.stats[4].base_stat )
        {
            $(progress_attack).css("background-color", "#cb2d3e");
        }
        if(50< results.stats[4].base_stat )
        {
            $(progress_attack).css("background-color", "#f79d00");
        }
        if(81< results.stats[4].base_stat )
        {
            $(progress_attack).css("background-color", "#a8e063");
        }
         if(120<results.stats[4].base_stat )
        {
            $(progress_attack).css("background-color", "#56ab2f");
        } 
        if(160<results.stats[4].base_stat)
        {
            $(progress_attack).css("background-color", "#3a7bd5");
        }

        var def = (results.stats[3].base_stat/255)*100;
        $(progress_defence).attr("style",`width:${def}%`)
        if(50 >= results.stats[3].base_stat )
        {
            $(progress_defence).css("background-color", "#cb2d3e");
        }
        if(50< results.stats[3].base_stat )
        {
            $(progress_defence).css("background-color", "#f79d00");
        }
        if(81< results.stats[3].base_stat )
        {
            $(progress_defence).css("background-color", "#a8e063");
        }
         if(120<results.stats[3].base_stat )
        {
            $(progress_defence).css("background-color", "#56ab2f");
        } 
        if(160<results.stats[3].base_stat)
        {
            $(progress_defence).css("background-color", "#3a7bd5");
        }
        
        var spa = (results.stats[2].base_stat/255)*100;
        $(progress_spa).attr("style",`width:${spa}%`)
        if(50 >= results.stats[2].base_stat )
        {
            $(progress_spa).css("background-color", "#cb2d3e");
        }
        if(50< results.stats[2].base_stat )
        {
            $(progress_spa).css("background-color", "#f79d00");
        }
        if(81< results.stats[2].base_stat )
        {
            $(progress_spa).css("background-color", "#a8e063");
        }
         if(120<results.stats[2].base_stat )
        {
            $(progress_spa).css("background-color", "#56ab2f");
        } 
        if(160<results.stats[2].base_stat)
        {
            $(progress_spa).css("background-color", "#3a7bd5");
        }

        var spd = (results.stats[1].base_stat/255)*100;
        $(progress_spd).attr("style",`width:${spd}%`)

        if(50 >= results.stats[1].base_stat )
        {
            $(progress_spd).css("background-color", "#cb2d3e");
        }
        if(50< results.stats[1].base_stat )
        {
            $(progress_spd).css("background-color", "#f79d00");
        }
        if(81< results.stats[1].base_stat )
        {
            $(progress_spd).css("background-color", "#a8e063");
        }
         if(120<results.stats[1].base_stat )
        {
            $(progress_spd).css("background-color", "#56ab2f");
        } 
        if(160<results.stats[1].base_stat)
        {
            $(progress_spd).css("background-color", "#3a7bd5");
        }

        var spe = (results.stats[0].base_stat/255)*100;
        $(progress_spe).attr("style",`width:${spe}%`)
        if(50 >= results.stats[0].base_stat )
        {
            $(progress_spe).css("background-color", "#cb2d3e");
        }
        if(50< results.stats[0].base_stat )
        {
            $(progress_spe).css("background-color", "#f79d00");
        }
        if(81< results.stats[0].base_stat )
        {
            $(progress_spe).css("background-color", "#a8e063");
        }
         if(120<results.stats[0].base_stat )
        {
            $(progress_spe).css("background-color", "#56ab2f");
        } 
        if(160<results.stats[0].base_stat)
        {
            $(progress_spe).css("background-color", "#3a7bd5");
        }
        
        var total = results.stats[5].base_stat + results.stats[4].base_stat+results.stats[3].base_stat+results.stats[2].base_stat+results.stats[1].base_stat+results.stats[0].base_stat;

        pokemon_TotalStat.innerHTML=total;
        pokemon_HPStat.innerHTML=results.stats[5].base_stat;
        pokemon_AttStat.innerHTML=results.stats[4].base_stat;
        pokemon_DefStat.innerHTML=results.stats[3].base_stat;
        pokemon_SPAStat.innerHTML=results.stats[2].base_stat;
        pokemon_SPDStat.innerHTML=results.stats[1].base_stat;
        pokemon_SPEStat.innerHTML=results.stats[0].base_stat;
    }).catch(error=>{console.log(error)})


  });



