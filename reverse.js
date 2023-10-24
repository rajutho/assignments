let sentance='this is a sun day'
function rev (str){
    return str.split(" ").map(s=>{return s.split("").reverse().join(" ").toString()})
}
console.log(rev(sentance))
