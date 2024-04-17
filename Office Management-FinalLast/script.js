
function myFunction() {
    var element = document.body;
    element.classList.toggle("dark-mode");
    var buttonText = document.getElementById('button');
    if (buttonText.innerText == 'Dark Mode') {
        buttonText.innerText = 'Light Mode';
    }
    else if (buttonText.innerText == 'Light Mode') {
        buttonText.innerText = 'Dark Mode';
    }
}