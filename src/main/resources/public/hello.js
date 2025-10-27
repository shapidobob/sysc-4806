$(document).ready(function() {
    $.ajax({
        url: "src/main/java/com/example/lab_3/AddressBook"
    }).then(function(AddressBookController) {
       $('.greeting-id').append();
       $('.greeting-content').append(data.content);
    });
});//wasn't able to get ajax working