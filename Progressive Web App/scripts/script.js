function createTable(){
    $('#Tab').html(" ");
    let class_name = $('#className').val();
    let class_type = $('#classType').find('option:selected').text();
    let class_number = $('#classNumber').val();
    let section_number = $('#sectionNumber').val();
    let start_time = $('#startTime').val();

    var content = "<table><td>" + class_name + "</td><td>" + class_type + "</td><td>" + class_number + "</td><td>" + section_number + "</td><td>" + start_time + "</td></table>";
    $('#Tab').attr("class", "table table-hover table-responsive container col-md-6");
    $('#Tab').append(content);
}

function createForm(){
    $('#Tab').html(" ");
}

function load() {
    console.log("Page load finished");
}