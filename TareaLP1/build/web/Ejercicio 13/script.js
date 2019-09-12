function change(){
    var checkboxes = document.getElementsByName('courses')
    var result = document.getElementById('result')
    result.value = ''
    checkboxes.forEach(tag => {
        if(tag.checked==true){
            result.value += tag.value+'\n'
        } 
    });
}