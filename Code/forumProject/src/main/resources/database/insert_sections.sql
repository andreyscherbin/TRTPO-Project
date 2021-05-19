

INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('1', 'News', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('2', 'Music', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('3', 'Travel', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('4', 'Programming', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('5', 'Fashion', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('6', 'Auto', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('7', 'Design', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('8', 'Business', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('9', 'Books', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('10', 'Space', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('11', 'Politics', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('12', 'Communication', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('13', 'TV series', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('14', 'Technique', ' ');
INSERT INTO forum.sections (forum.sections.id, forum.sections.name, forum.sections.description)
VALUES ('15', 'History', ' ');

INSERT INTO forum.user (forum.user.id, forum.user.active, forum.user.createdAt, forum.user.email, forum.user.gender, forum.user.lastLoginTime, forum.user.password, forum.user.removed, forum.user.role, forum.user.username)
VALUES ('2', 1, '2038-01-19 03:14:07', 'admin@gmail.com', '1', '2038-01-19 03:14:07', '$2a$10$SY6LaqJlNfYWBVAZvjtYPe1T5Bx6Wcq9d9xvNrPAmFPxqpXXV6q5u', 0,'2', 'admin');

INSERT INTO forum.useradditionalinfo (forum.useradditionalinfo.user, forum.useradditionalinfo.aboutMe, forum.useradditionalinfo.birthday, forum.useradditionalinfo.city, forum.useradditionalinfo.footer, forum.useradditionalinfo.lastName, forum.useradditionalinfo.name, forum.useradditionalinfo.phone)
VALUES ('2', NULL, NULL, NULL, NULL, 'admin', 'adminovich', NULL);

INSERT INTO forum.topic (forum.topic.id, forum.topic.closed, forum.topic.content, forum.topic.creationDate, forum.topic.lastUpdateDate, forum.topic.title, forum.topic.views, forum.topic.section_id, forum.topic.user_id)
VALUES ('1', 0, 'French bars and restaurants as well as cultural sites and non-essential shops will be allowed to reopen to customers on May 19.

President Emmanuel Macron outlined the phasing out of restrictions in an interview with regional newspapers on Thursday.

Some of the steps, including the reopening of borders to foreign tourists from June 9, will only be possible with a health pass attesting the holder has either been vaccinated, has recently tested positive for the virus, or has recently recovered from it.

The country has been under a third national lookdown since April 3, following a surge of infections blamed on the spread of COVID-19 variants. The current restrictions include a 7 pm nighttime curfew, a ban on travelling further than 10 km away from home, and the closure of all non-essential businesses.

Frances four-phase timetable for easing restrictions
Here are the key dates in France next round of easing:
 May 3: The 10-km travel ban is lifted and people can travel cross-country.

May 19: The nighttime curfew is pushed back by two hours to 9 pm; non-essential shops can reopen; outdoor drinking and dining permitted with a maximum of six people at the same table; cultural venues including museums, cinemas, and theatres can reopen with a maximum capacity of 800 indoor and 1,000 outdoor; outdoor sporting venues can reopen with capacity capped at 1,000.

These are conditional on the epidemiological situation with areas where the incidence rate is over 400 cases per 100,000 population not allowed to proceed.

June 9: The curfew is pushed back by another two hours to 11 pm; bars and restaurants are allowed to welcome customers indoors with a maximum of six people per table; capacity at cultural and sporting venues is increased to 5,000 people with health passes; gyms can reopen with physical activity, including team sports, allowed both indoors and outdoors; large exhibitions and fairs can be held and welcome up to 5,000 people with health passes; foreign tourists with health passes can enter the country.

June 30: the curfew is lifted as is the 1,000 capacity rule for large events but attendees will be required to show their health passes; nightclubs remain closed.', '2020-04-29 20:14:00', '2020-04-29 20:14:00', 'France eases lockdown as bars, restaurants, museums and cinemas to reopen May 19', 0, 1, 2);
INSERT INTO forum.topic (forum.topic.id, forum.topic.closed, forum.topic.content, forum.topic.creationDate, forum.topic.lastUpdateDate, forum.topic.title, forum.topic.views, forum.topic.section_id, forum.topic.user_id)
VALUES ('2', 0, 'Paris is one of the most instantly recognisable locations on the planet. From appearances in films, television series and countless Instagram holiday posts, it’s hard to imagine there could possibly be an angle we haven’t all seen before.

The historical French city is home to so many iconic spots associated with history and romance, that it’s difficult to represent Paris without falling into cliches.

However a new book called ‘Paris from the Air’ by award winning photographer, architect and pilot Jeffrey Milstein manages just that by showing the city of love from a new ‘unimaginable’ angle.

Capturing the quintessential Parisian landmarks and views from above, Milstein intends to display the home of Coco Chanel and Marie Antoinette to readers in a completely new and breathtaking light.

', '2020-04-29 20:16:00', '2020-04-29 20:16:00','Paris from the Sky: Photographer captures extraordinary aerial shots of the French capital', 0,1, 2);
INSERT INTO forum.topic (forum.topic.id, forum.topic.closed, forum.topic.content, forum.topic.creationDate, forum.topic.lastUpdateDate, forum.topic.title, forum.topic.views, forum.topic.section_id, forum.topic.user_id)
VALUES ('3', 0, 'In Mutriku, northern Spain, scientists from the AZTI research centre are working on a European project that aims to replace plastics used in aquaculture with something more environmentally friendly.

Local entrepreneur, Imanol Gurruchaga, runs an open-water mussel farm where mussels are grown on long ropes, suspended underwater. Mesh protects them from predators. The ropes and the mesh used are made of plastic. When they are no longer of use, they become a problem.

Imanol tells us that "all aquaculture generates some plastic residue, whether it’s the production of salmon or sea bream". His aquaculture farm uses ropes to grow mussels and he points out that "there are many ropes, and many ropes create a lot of waste".

However, local authorities are increasingly pressing for change. "They are already asking us to do all our ecological production with biodegradable ropes within a year or two”, Imanol adds.
To find a solution to plastic waste in the sea, researchers working in the European project, BIOGEARS,- have developed compostable aquaculture ropes. Leire Arantzamendi Egiguren is the project coordinator and she works for AZTI. She says that their first net prototype developed with BIOGEARS "contains bioplastic materials of natural origin". According to her, it makes them biodegradable and they can thus be "more environmentally friendly and can provide added value to the sector".', '2020-04-29 20:18:00', '2020-04-29 20:18:00', 'Reducing plastic in fishing and aquaculture: what alternatives to protect our oceans?', 0, 1, 2);
INSERT INTO forum.topic (forum.topic.id, forum.topic.closed, forum.topic.content, forum.topic.creationDate, forum.topic.lastUpdateDate, forum.topic.title, forum.topic.views, forum.topic.section_id, forum.topic.user_id)
VALUES ('4', 0, 'Four years after a former government ministers new movement helped him defeat a plethora of higher-profile candidates to become president of France, his political brand has remained something of a mystery.

Emmanuel Macron sold himself as both right and left politically and as someone who would fundamentally change a technocratic French government system.

A former economy minister in the Socialist Party, he garnered support from all over the political spectrum when he launched his movement “En Marche”. He explained to a classroom of children in 2017 that he would try to take from both the left and the right.

Now a year away from France’s upcoming presidential elections, his approval ratings have plummeted and some are torn on where he stands politically. Many say he has increasingly endorsed more right-leaning policies.

According to the most recent poll from IFOP, around 37% of French people approved of the president. It’s a far cry from the 62% approval rating he enjoyed after he was first elected.', '2020-04-29 20:19:00', '2020-04-29 20:19:00', 'After four years of Macron, are we any closer to understanding what he stands for?', 0, 1, 2);
INSERT INTO forum.topic (forum.topic.id, forum.topic.closed, forum.topic.content, forum.topic.creationDate, forum.topic.lastUpdateDate, forum.topic.title, forum.topic.views, forum.topic.section_id, forum.topic.user_id)
VALUES ('5', 0, 'The EU could miss its goal of vaccinating 70% of adults against COVID-19 by the summer by months, according to the latest projections, due to vaccine suspensions and changes to rollouts within member states.

A number of countries have already halted the use of the AstraZeneca jab, on which Europe has been relying to reach its goals, after the European Medicines Agency (EMA) announced a “possible link” between the jab and a rare form of blood clot.

Johnson & Johnson then delayed the rollout of its vaccine in Europe amid blood clot reports in the US, which are being investigated.

Without these two vaccines in the mix, the EU could see its timeline pushed back to 8 December, according to science analytics company Airfinity.

“They’re very dependent on Johnson & Johnson, they’ve got 200 million doses on order and it’s a single shot vaccine,” explained Airfinity senior analyst Matt Linley.', '2020-04-29 20:20:00', '2020-04-29 20:20:00', 'Vaccine doubts could delay EUs inoculation target by several months', 0, 1, 2);