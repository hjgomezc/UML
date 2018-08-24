Feature: topfive
  As a user
  I want to get the five top songs
  so that I can know the best five songs

Scenario:
  Given That I am connected to kafka music app
  When I request to see the five most played songs
  Then I can see the five top songs



