const images = [
    "https://cdn.pixabay.com/photo/2024/05/26/10/15/bird-8788491_1280.jpg",
    "https://t4.ftcdn.net/jpg/07/56/05/59/360_F_756055912_kGrLGy3Yof2jKR7h27cbJKN2aj2VBW6G.jpg",
    "https://gaming-cdn.com/images/products/1600/orig/prince-of-persia-warrior-within-pc-game-ubisoft-connect-cover.jpg?v=1644915371",
    "https://m.blog.hu/fi/filmbook/image/ttpop.jpg"
  ];
  let currentIndex = 0;
  
  const sliderImage = document.getElementById("sliderImage");
  sliderImage.src = images[currentIndex];
  
  function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    sliderImage.src = images[currentIndex];
  }
  
  function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    sliderImage.src = images[currentIndex];
  }
  