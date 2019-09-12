const input1 = document.getElementById('input1')
const input2 = document.getElementById('input2')
const add = document.getElementById('add')
const subtract = document.getElementById('subtract')
const multiply = document.getElementById('multiply')
const divide = document.getElementById('divide')
const result = document.getElementById('result')

function validateNumber(input1,input2){
    if(isNaN(input1) || isNaN(input2) || input1=='' || input2==''){
        return false
    }
    return true
}

function processOperation(input1,input2,operation){
    if(!validateNumber(input1.value,input2.value)){
        alert('Ingrese números')
    }else{
        result.value = eval(input1.value+operation.value+input2.value)
    }
}

add.addEventListener('click',()=>{processOperation(input1,input2,add)})
subtract.addEventListener('click',()=>{processOperation(input1,input2,subtract)})
multiply.addEventListener('click',()=>{processOperation(input1,input2,multiply)})
divide.addEventListener('click',()=>{processOperation(input1,input2,divide)})