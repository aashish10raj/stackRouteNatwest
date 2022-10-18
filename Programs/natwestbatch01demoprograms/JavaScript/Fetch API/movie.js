// fetch('http://www.omdbapi.com/?apikey=2103538a&t=3 Idiots&y=2009')
// .then(response=>response.json())
// .then(data=>console.log(data));

searchMovie=()=>{
    moviename=document.getElementById('moviename').value;
    year=document.getElementById('year').value;

fetch(`http://www.omdbapi.com/?apikey=2103538a&t=${moviename}&y=${year}`)
.then(response=>response.json())
.then(data=>{
    if(data.Response==="True"){
    document.getElementById('poster').src=data.Poster;
    document.getElementById('title').innerHTML=data.Title;
    document.getElementById('plot').innerHTML=data.Plot;
    document.getElementById('actors').innerHTML=data.Actors;
    document.getElementById('director').innerHTML=data.Director;
    document.getElementById('genre').innerHTML=data.Genre;
    document.getElementById('duration').innerHTML=data.Runtime;
}else{
   alert('Movie not found');
}

});

}