INSERT INTO team (name)
VALUES ('Japan'),
       ('Madagascar'),
       ('FC FOOT UNITED');

INSERT INTO team_play_against (datetime, stadium, team_a_id, team_b_id)
VALUES ('2022-12-19', 'Kianja Barea Mahamasina', 1, 2);

INSERT INTO player (name, number, team_id)
VALUES ('Jerome mombris', 2, 1),
       ('Chong kai check', 10, 2),
       ('Carolus R.', 9, 3),
       ('Wai lee thung', 11, 3);

INSERT INTO sponsor (name)
VALUES ('Coca cola'),
       ('Peugeot'),
       ('Yamaha');

INSERT INTO team_have_sponsor (team_id, sponsor_id)
VALUES (1, 1),
       (2, 1),
       (3, 2),
       (3, 3);

INSERT INTO goal (match_id) values
(1);

INSERT INTO player_score_goal (player_id, goal_id, scoring_time, is_og)
values (1, 1, 45, false),
      (1, 1, 45, false),
       (1, 1, 46, false),
       (1, 1, 49, true),
       (1, 1, 25, false),
       (2, 1, 42, false),
       (2, 1, 90, true),
       (2, 1, 23, false);




