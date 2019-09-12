document.getElementById('button').addEventListener('click',()=>{
    const checkboxes = Array.from(document.getElementsByName('courses')).filter(element=>element.checked==true)
    const array = checkboxes.map(element=>element.value)
    const result = document.getElementById('result')
    result.value = ''
    array.forEach(value => {
        result.value+=value+'\n'
    });
})