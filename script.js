function addTask() {
 var taskInput = document.getElementById('taskInput');
 var taskList = document.getElementById('taskList');
 if (taskInput.value.trim() !== '') {
   var newTask = document.createElement('li');
   newTask.innerText = taskInput.value;
   newTask.onclick = function () {
     this.remove();
 };
   taskList.appendChild(newTask);
   taskInput.value = '';
 }
}
