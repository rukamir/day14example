;(function () {
    'use strict'
    window.onload = function () {
        var importButton = document.querySelector('#import')
        importButton.addEventListener('click', importStudents)

        var pickButton = document.querySelector('#pick-student')
        pickButton.addEventListener('click',displayRandomStudentName )
    }

    let studentList = []

    function importStudents() {
        console.log('importing')
        fetch('http://localhost:8080/students')
            .then((response) => response.json())
            .then((students) => {
                studentList = students
                console.log(studentList)
                document.querySelector('#student-count').innerHTML = `Student Count: ${studentList.length}`
                if(studentList.length) {
                    document.querySelector('#pick-student').classList.remove('hidden')
                }
            })
        .catch((error) => {
            console.log(error)
            document.querySelector('#error-message').innerHTML = error.message
        })
    }

    function displayRandomStudentName() {
        let rando = Math.floor(Math.random() * studentList.length)
        document.querySelector("#student-name").innerHTML = studentList[rando].name
    }

}());
