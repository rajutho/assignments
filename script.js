const display =document.querySelector(".display");
const butttons =document.querySelectorAll("button");
const special =["%","*","/","=","+","-"];
let output="";


const cal=(btnvalue)=>{
    if(btnvalue==="="&& output!==""){
        output=eval(output.replace("%","/100"));

    }else if(btnvalue ==="AC"){
        output="";

    }else if(btnvalue=="DEL"){
        output=output.toString().slice(0,-1);
    }else{
        if(output===""&& special.includes(btnvalue)) return;
        output +=btnvalue;
    }
    display.value=output

}
butttons.forEach((button)=>{
    button.addEventListener("click", (e)=>cal(e.target.dataset.value));

})