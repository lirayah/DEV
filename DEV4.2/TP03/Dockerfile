FROM httpd:alpine3.19

LABEL   MAINTENAIR="Morin Lionel" \
        VERSION="3.18" \
        TP="3"

COPY ./dayScheduler/ /usr/local/apache2/htdocs/

RUN sed -i "s/Work Day Scheduler/Morin Lionel/g" /usr/local/apache2/htdocs/index.html

ENV SCHOOL=IUT \
    LEVEL=1.8
