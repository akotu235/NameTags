window.addEventListener("load", function () {
    const cards = document.querySelectorAll('.card');
    for (let i = 0; i < cards.length; i++) {
        cards[i].appendChild(getImg());
    }
});

function getImg() {
    const img = document.createElement('img');
    img.src = "/images/img.png";
    return img;
}