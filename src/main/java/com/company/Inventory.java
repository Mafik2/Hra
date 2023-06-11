package com.company;

import java.util.*;

public class Inventory {

    private List<String> itemNames;
    private List<Item> items;
    private Random random;
    private double money;

    public Inventory() {
        itemNames = new ArrayList<>();
        itemNames.add("Modrá tužka");
        itemNames.add("Džíny");
        itemNames.add("Hráčka");
        itemNames.add("Džíny");
        itemNames.add("Hráčka");
        itemNames.add("Klíče");
        itemNames.add("Náramek");
        itemNames.add("Peněženka");
        itemNames.add("Kniha");
        itemNames.add("Sluchátka");
        itemNames.add("Mobilní telefon");
        itemNames.add("Brýle");
        itemNames.add("Náhrdelník");
        itemNames.add("Hodinky");
        itemNames.add("Notebook");
        itemNames.add("Brusle");
        itemNames.add("USB flash disk");
        itemNames.add("Sponka do vlasů");
        itemNames.add("Klávesnice");
        itemNames.add("Plnící pero");
        itemNames.add("Šperkovnice");
        itemNames.add("Náhradní baterie");
        itemNames.add("Kabelka");
        itemNames.add("Kapesníčky");
        itemNames.add("Pásek");
        itemNames.add("Náhrdelník");
        itemNames.add("Mobilní nabíječka");
        itemNames.add("Tiskárna");
        itemNames.add("Přenosný reproduktor");
        itemNames.add("Klobouk");
        itemNames.add("Nůžky");
        itemNames.add("Kompas");
        itemNames.add("Zrcátko");
        itemNames.add("Nálepky");
        itemNames.add("Parfém");
        itemNames.add("Sluneční brýle");
        itemNames.add("Náramek");
        itemNames.add("Mobilní pouzdro");
        itemNames.add("Kalkulačka");
        itemNames.add("Termohrnek");
        itemNames.add("Svíčka");
        itemNames.add("Píšťalka");
        itemNames.add("Náplast");
        itemNames.add("Náhradní klíč");
        itemNames.add("Dudlík");
        itemNames.add("Obal na brýle");
        itemNames.add("Náhradní propiska");
        itemNames.add("Batoh");
        itemNames.add("Fén na vlasy");
        itemNames.add("Papír");
        itemNames.add("Dudlík");
        itemNames.add("Podložka pod myš");
        itemNames.add("Kulich");
        itemNames.add("Hudební CD");
        itemNames.add("Náramek");
        itemNames.add("Kulaté náušnice");
        itemNames.add("Papírový kapesník");
        itemNames.add("Pilník na nehty");
        itemNames.add("Spona na vlasy");
        itemNames.add("Květinový vzorek");
        itemNames.add("Kniha");
        itemNames.add("Nálepky");
        itemNames.add("LED svítilna");
        itemNames.add("Pilník na nehty");
        itemNames.add("Magnetka");
        itemNames.add("Pásek");
        itemNames.add("Kontaktní čočky");
        itemNames.add("Brýle na čtení");
        itemNames.add("CD/DVD disky");
        itemNames.add("Náhradní šroubky");
        itemNames.add("Papírové ubrousky");
        itemNames.add("Obal na mobilní telefon");
        itemNames.add("Brašna");
        itemNames.add("Poznámkový blok");
        itemNames.add("Prsten");
        itemNames.add("Hrnek");
        itemNames.add("Hudební přehrávač");
        itemNames.add("Náramek");
        itemNames.add("Perníček");
        itemNames.add("Kulaté brýle");
        itemNames.add("Květinová náušnice");
        itemNames.add("Kulich");
        itemNames.add("Spona na vlasy");
        itemNames.add("Přívěsek");
        itemNames.add("Lístek na koncert");
        itemNames.add("Nůž");
        itemNames.add("Obal na sluchátka");
        itemNames.add("Plastový příbor");
        itemNames.add("Perníček");
        itemNames.add("Náramek");
        itemNames.add("Hrnek");
        itemNames.add("Poznámkový blok");
        itemNames.add("Hudební přehrávač");
        itemNames.add("Kulaté brýle");
        itemNames.add("Květinová náušnice");
        itemNames.add("Kulich");
        itemNames.add("Spona na vlasy");
        itemNames.add("Přívěsek");
        itemNames.add("Lístek na koncert");
        itemNames.add("Nůž");
        itemNames.add("Obal na sluchátka");
        itemNames.add("Plastový příbor");
        itemNames.add("Sluneční brýle");
        itemNames.add("Zápisník");
        itemNames.add("Přívěsek");
        itemNames.add("Drobné mince");
        itemNames.add("Lak na nehty");
        itemNames.add("Náhradní šroubky");
        itemNames.add("Rukavice");
        itemNames.add("Kabel");
        itemNames.add("Párátka");
        itemNames.add("Klíčenka");
        itemNames.add("Hřeben");
        itemNames.add("Nálepky");
        itemNames.add("Perník");
        itemNames.add("Pásek");
        itemNames.add("Kostka cukru");
        itemNames.add("Náplast");
        itemNames.add("Dudlík");
        itemNames.add("Fólie na jídlo");
        itemNames.add("Propiska");
        itemNames.add("Hudební přehrávač");
        itemNames.add("Šála");
        itemNames.add("Náhradní baterie");
        itemNames.add("Brýlový obal");
        itemNames.add("Nůžky");
        itemNames.add("Kuličková pero");
        itemNames.add("Květinová náušnice");
        itemNames.add("Pilník na nehty");
        itemNames.add("Zrcátko");
        itemNames.add("Pěnová míčka");
        itemNames.add("Náramek");
        itemNames.add("Spona na vlasy");
        itemNames.add("USB kabel");
        itemNames.add("Perník");
        itemNames.add("Kalkulačka");
        itemNames.add("Náhradní klíč");
        itemNames.add("Brašna");
        itemNames.add("Prášek do pečiva");
        itemNames.add("Mobilní pouzdro");
        itemNames.add("Náhradní propiska");
        itemNames.add("Vodítko pro psa");
        itemNames.add("Brýle na čtení");
        itemNames.add("Náhradní obal na mobil");
        itemNames.add("Kapesníčky");
        itemNames.add("Kartonová krabička");
        itemNames.add("Kulaté náušnice");
        itemNames.add("Barevná guma");
        itemNames.add("Podložka pod myš");
        itemNames.add("Svíčka");
        itemNames.add("Kulich");
        itemNames.add("Hudební CD");
        itemNames.add("Náramek");
        itemNames.add("Kulaté náušnice");
        itemNames.add("Papírový kapesník");
        itemNames.add("Pilník na nehty");
        itemNames.add("Spona na vlasy");
        itemNames.add("Květinový vzorek");
        itemNames.add("Kniha");
        itemNames.add("Nálepky");
        itemNames.add("LED svítilna");
        itemNames.add("Pilník na nehty");
        itemNames.add("Magnetka");
        itemNames.add("Pásek");
        itemNames.add("Kontaktní čočky");
        itemNames.add("Brýle na čtení");
        itemNames.add("CD/DVD disky");
        itemNames.add("Náhradní šroubky");
        itemNames.add("Papírové ubrousky");
        itemNames.add("Obal na mobilní telefon");
        itemNames.add("Brašna");
        itemNames.add("Poznámkový blok");
        itemNames.add("Prsten");
        itemNames.add("Hrnek");
        itemNames.add("Hudební přehrávač");
        itemNames.add("Náramek");
        itemNames.add("Perníček");
        itemNames.add("Kulaté brýle");
        itemNames.add("Květinová náušnice");
        itemNames.add("Kulich");
        itemNames.add("Spona na vlasy");
        itemNames.add("Přívěsek");
        itemNames.add("Lístek na koncert");
        itemNames.add("Nůž");
        itemNames.add("Obal na sluchátka");
        itemNames.add("Plastový příbor");
        itemNames.add("Perníček");
        itemNames.add("Náramek");
        itemNames.add("Hrnek");
        itemNames.add("Poznámkový blok");
        itemNames.add("Hudební přehrávač");
        itemNames.add("Kulaté brýle");
        itemNames.add("Květinová náušnice");
        itemNames.add("Kulich");
        itemNames.add("Spona na vlasy");
        itemNames.add("Přívěsek");
        itemNames.add("Lístek na koncert");
        itemNames.add("Nůž");
        itemNames.add("Obal na sluchátka");
        itemNames.add("Plastový příbor");
        itemNames.add("Sluneční brýle");
        itemNames.add("Zápisník");
        itemNames.add("Přívěsek");
        itemNames.add("Drobné mince");
        itemNames.add("Lak na nehty");
        itemNames.add("Náhradní šroubky");
        itemNames.add("Rukavice");
        itemNames.add("Kabel");
        itemNames.add("Párátka");
        itemNames.add("Klíčenka");
        itemNames.add("Hřeben");
        itemNames.add("Nálepky");
        itemNames.add("Perník");
        itemNames.add("Pásek");
        itemNames.add("Kostka cukru");
        itemNames.add("Náplast");
        itemNames.add("Dudlík");
        itemNames.add("Fólie na jídlo");
        itemNames.add("Propiska");
        itemNames.add("Hudební přehrávač");
        itemNames.add("Šála");
        itemNames.add("Náhradní baterie");
        itemNames.add("Brýlový obal");
        itemNames.add("Nůžky");
        itemNames.add("Kuličková pero");
        itemNames.add("Květinová náušnice");
        itemNames.add("Pilník na nehty");
        itemNames.add("Zrcátko");
        itemNames.add("Pěnová míčka");
        itemNames.add("Náramek");
        itemNames.add("Spona na vlasy");
        itemNames.add("USB kabel");
        itemNames.add("Perník");
        itemNames.add("Kalkulačka");
        itemNames.add("Náhradní klíč");
        itemNames.add("Brašna");
        itemNames.add("Prášek do pečiva");
        itemNames.add("Mobilní pouzdro");
        itemNames.add("Náhradní propiska");
        itemNames.add("Vodítko pro psa");
        itemNames.add("Brýle na čtení");
        itemNames.add("Náhradní obal na mobil");
        itemNames.add("Kapesníčky");
        itemNames.add("Kartonová krabička");
        itemNames.add("Kulaté náušnice");
        itemNames.add("Barevná guma");
        itemNames.add("Podložka pod myš");
        itemNames.add("Svíčka");
        itemNames.add("Kulich");
        itemNames.add("Hudební CD");
        itemNames.add("Náramek");
        itemNames.add("Kulaté náušnice");
        itemNames.add("Papírový kapesník");
        itemNames.add("Pilník na nehty");
        itemNames.add("Spona na vlasy");
        itemNames.add("Květinový vzorek");
        itemNames.add("Kniha");
        itemNames.add("Nálepky");
        itemNames.add("LED svítilna");
        itemNames.add("Pilník na nehty");
        itemNames.add("Magnetka");
        itemNames.add("Pásek");
        itemNames.add("Kontaktní čočky");
        itemNames.add("Brýle na čtení");
        itemNames.add("CD/DVD disky");
        itemNames.add("Náhradní šroubky");
        itemNames.add("Papírové ubrousky");
        itemNames.add("Obal na mobilní telefon");
        itemNames.add("Brašna");
        itemNames.add("Poznámkový blok");
        itemNames.add("Prsten");
        itemNames.add("Hrnek");
        itemNames.add("Hudební přehrávač");
        itemNames.add("Náramek");
        itemNames.add("Perníček");
        itemNames.add("Kulaté brýle");
        itemNames.add("Květinová náušnice");
        itemNames.add("Kulich");
        itemNames.add("Spona na vlasy");
        itemNames.add("Přívěsek");
        itemNames.add("Lístek na koncert");
        itemNames.add("Nůž");
        itemNames.add("Obal na sluchátka");
        itemNames.add("Plastový příbor");

        // Odstranění duplikátů pomocí HashSet
        HashSet<String> uniqueItems = new HashSet<>(itemNames);
        itemNames.clear();
        itemNames.addAll(uniqueItems);

        items = new ArrayList<>();
        random = new Random();
        money = 0.0;
    }

    public void addItem() {
        int randomIndex = random.nextInt(itemNames.size());
        String itemName = itemNames.get(randomIndex);
        Item item = new Item(itemName, "", randomIndex, 10.0);
        items.add(item);
    }

    public boolean removeItem(Item item) {
        return items.remove(item);
    }

    public boolean containsItem(Item item) {
        return items.contains(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public void clearItems() {
        items.clear();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void addMoney(double amount) {
        money += amount;
    }

    public List<Item> getItems() {
        return items;
    }
}