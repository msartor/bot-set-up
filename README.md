#Pushing branch to Heroku
git push heroku yourlocalbranch:master

heroku ps:scale web=1

heroku open


# Add WAR plugin
heroku plugins:install https://github.com/heroku/heroku-deploy

#Create WAR
mvn compile war:war 

# Deploy WAR
heroku deploy:war --war <path_to_war_file> --app <app_name>

