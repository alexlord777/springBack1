// Call the dataTables jQuery plugin
$(document).ready(function() {
  $('#dataTable').DataTable();
});

function loadUsers(){
   const data = await fetch('user/123',{
   method:'GET',
    headers: {
          'Accept':'application/json',
         'Content-Type': 'application/json'
         // 'Content-Type': 'application/x-www-form-urlencoded',
       },
       body: JSON.stringify(data) // body data type must match "Content-Type" header
   })
}
