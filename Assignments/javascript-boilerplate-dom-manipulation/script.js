countQuerry = () => {
    let repoName = document.getElementById("countQueryRepositoryInput").value;
    let count = document.getElementById("countQueryIssueType").value;
    alert(`Query count of the ${repoName} is ${count}`);
}

var repoDetails = [
    {
        repo: "sagar.patke/bootstrap-assignment",
        countIssue: 2
    },
    {
        repo: "sagar.patke/javascript-assignment",
        countIssue: 1
    },
    {
        repo: "sagar.patke/angular-assignment",
        countIssue: 0
    }, 
    {
        repo: "sagar.patke/java-assignment",
        countIssue: 3
    }

]

let input = document.getElementById("countQueryRepositoryInput");
input.setAttribute("list", "choices");
let datalist = document.createElement("datalist");
datalist.setAttribute("id", "choices");
input.appendChild(datalist);

for(let i=0; i<4; i++) {
    let op = document.createElement("option");
    op.setAttribute("value", repoDetails[i].repo);
    datalist.appendChild(op);
}

fillDetails=()=>{
    let repoName = document.getElementById("countQueryRepositoryInput").value;
    for(let i=0; i<4; i++) {
        if(repoName.localeCompare(repoDetails[i].repo) == 0) {
            document.getElementById("countQueryIssueType").value = repoDetails[i].countIssue; 
        }
    }
}