function submitFunction() {
    // Getting values
    console.log("Hello");
    let fname = document.getElementById("fname").value;
    let lname = document.getElementById("lname").value;
    let email = document.getElementById("email").value;
    // let credit = document.getElementById("credit").value;
    // let term = document.getElementById("term").value;
    // let no_of_students = document.getElementById("no_of_students").value;

    console.log(fname);
    console.log(lname);
    console.log(email);
    let obj = {
        first_name : fname,
        last_name: lname,
        email: email,
        title: "title",
        photograph_path: "path",
    };

    // Send to Backend
    fetch("http://localhost:8080/ERP_war_exploded/api/login/register", {
        // Adding method type
        method: "POST",
        // Adding body or contents to send
        body: JSON.stringify(obj),
        // Adding headers to the request
        headers: {
            "Content-type": "application/json; charset=UTF-8",
        },
    })
        // Converting to JSON
        .then((response) => response.json())

        // Displaying results to console
        .then((json) => {
            console.log(json)

            // Popup
            Swal.fire({
                title: 'Submitted!',
                text: 'Details has been submitted',
                icon: 'success',
                confirmButtonText: 'Okay'
            })
        });


}
