package pm.api

class BootStrap {

    def init = { servletContext ->

       new Project(
         name: "TranslateMe",
         description: "Implemented a beautiful user interface employing React with Semantic-React for styling. Developed a Rails API backend. Implemented IBM Visual Recognition to classify images users upload. Implemented IBM Language Translator to translate words users select Utilized Cloudinary to save images users upload",
         startDate: "July 2019",
         endDate: "July 2019",
         githubLink: "https://github.com/MarioR9/TranslateMeFrontend").save()
        
        new Project(
         name: "Rick and Morty Adventures",
         description: "Rick and Morty Adventures is an rpg game that allows you to play as Rick and capture different Morties. In addition, users have to look after each Morty they capture and help them level up by keeping them healthy and fed.",
         startDate: "July 2019",
         endDate: "July 2019",
         githubLink: "https://github.com/MarioR9/RickAndMortyFrontend").save()
        
        new Project(
         name: "Tonester",
         description: "Tonester was build using vanilla javascript for the frontend and rails for the backend. Tonester allows users to save albums using Spotify’s API.",
         startDate: "July 2019",
         endDate: "July 2019",
         githubLink: "https://github.com/MarioR9/tonester_frontend").save()
        
        new Project(
         name: "UberEats HotZones",
         description: "Using Puppeteer.js to scrape data from google maps and Express.js to collect and fetch data. The application displays information to a user about how busy the restaurants are around a specific US location. the app will start with a map showing the user's current location, a search input fill, and a search button.",
         startDate: "January 2020",
         endDate: "February 2020",
         githubLink: "https://github.com/MarioR9/UberEats_HotZones").save()


        new User(
         name: "Mario R",
         bio: "Come from nothing to create something great in change the world!",
         github: "https://github.com/MarioR9",
         projects: 4).save() 
        
    }
 
    def destroy = {
    }
}
