// Function to open the modal
function learnMore() {
    document.querySelector('.modal').style.display = 'block';
    document.querySelector('.overlay').style.display = 'block';
}

// Function to close the modal
function closeModal() {
    document.querySelector('.modal').style.display = 'none';
    document.querySelector('.overlay').style.display = 'none';
}

// Close modal when clicking outside the modal
document.querySelector('.overlay').addEventListener('click', closeModal);
