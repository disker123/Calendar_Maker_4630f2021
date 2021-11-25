class Class{
    constructor(Name, Type, Number, Section, Time, Days){
        this.name = Name
        this.type = Type
        this.number = Number
        this.section = Section
        this.time = Time
        this.days = Days
    }
}

$(function(){
    $("#calandarForm").hide();
    first();
});

function first(){
    if (localStorage.length == 0){
        console.log(localStorage.length);
        $('#calandarForm').show();
        validator();
    }
    else{
        displayTable();
    }
}

function displayTable(){
    var classs = (JSON.parse(localStorage.getItem('GUI')));
    console.log(classs.name);
}

function validator(){
    $("#calandarForm").validate({
        rules: {
            className: {
                required: true
            },
            classType: {
                required: true
            },
            classNumber: {
                required: true
            },
            sectionNumber: {
                required: true
            },
            startTime: {
                required: true
            }
        },
        messages: {
            className: "Please Enter a Value.",
            classType: "Please Enter a Value.",
            classNumber: "Please Enter a Value.",
            sectionNumber: "Please Enter a Value.",
            startTime: "Please Enter a Value."
        },
        submitHandler: function() {
            var obj = createTable();
            localStorage.setItem(obj.name, JSON.stringify(obj));
            console.log(JSON.parse(localStorage.getItem(obj.name)));
        }
    });
}


function createTable(){
    $('#Tab').html(" ");
    let class_name = $('#className').val();
    let class_type = $('#classType').find('option:selected').text();
    let class_number = $('#classNumber').val();
    let section_number = $('#sectionNumber').val();
    let start_time = $('#startTime').val();
    var days = [];

    if ($('#classDaysMon').is(":checked"))
    {
        days.push("Monday");
    }

    if ($('#classDaysTues').is(":checked"))
    {
        days.push("Tuesday");
    }

    if ($('#classDaysWed').is(":checked"))
    {
        days.push("Wednesday");
    }

    if ($('#classDaysThurs').is(":checked"))
    {
        days.push("Thursday");
    }

    if ($('#classDaysFri').is(":checked"))
    {
        days.push("Friday");
    }

    if ($('#classDaysSat ').is(":checked"))
    {
        days.push("Saturday");
    }

    return (new Class(class_name, class_type, class_number, section_number, start_time, days));
}

function createForm(){
    $('#Tab').html(" ");
}

function load() {
    console.log("Page load finished");
}