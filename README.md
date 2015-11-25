#Pushing branch to Heroku
git push heroku yourlocalbranch:master

heroku ps:scale web=1

heroku open