FROM php:fpm-alpine

RUN adduser -D iut
RUN mkdir -p /opt/iut/info \
    && chown -R iut /opt/iut \
    && chmod -R 750 /opt/iut

ENV NOM="MORIN" \
    PRENOM="LIONEL" \
    POURCENTAGE_TACHE11=20 \
    POURCENTAGE_TACHE12=50 \
    POURCENTAGE_TACHE21=100