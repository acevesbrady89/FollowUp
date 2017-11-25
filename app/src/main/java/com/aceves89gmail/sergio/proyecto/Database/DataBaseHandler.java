package com.aceves89gmail.sergio.proyecto.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Eduardo on 06/11/2017.
 */

public class DataBaseHandler extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "TwitterAccounts.db";
    private static final int DATABASE_VERSION=1;
    private static final String TABLE_USERS = "Users";
    private static DataBaseHandler dataBaseHandler;
    //columnas
    public static final String KEY_ID = "idUser";
    public static final String KEY_USERNAME ="usuario";
    public static final String KEY_NAME ="nombre";
    public static final String KEY_FOLLOWERS="followers";

    private DataBaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public DataBaseHandler getInstance(Context context){
        if(dataBaseHandler==null){
            dataBaseHandler = new DataBaseHandler(context);

        }
        return dataBaseHandler;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE ="CREATE TABLE "+
                TABLE_USERS + " ("+KEY_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
                KEY_NAME+" TEXT,"+ KEY_USERNAME+" TEXT, "+KEY_FOLLOWERS+" INTEGER)";
        db.execSQL(CREATE_TABLE);

        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Katy Perry','@katyperry',105966629)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Justin Bieber','@justinbieber',103038968)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Barack Obama','@BarackObama',96641895)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Taylor Swift','@taylorswift13',85603369)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Rihanna','@rihanna',81688599)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Ellen DeGeneres','@TheEllenShow',75151736)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Lady Gaga','@ladygaga',73162808)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('YouTube','@YouTube',70336379)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Justin Timberlake','@jtimberlake',63226913)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Cristiano Ronaldo','@Cristiano',63148348)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Twitter','@Twitter',62045402)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Kim Kardashian West','@KimKardashian',56766549)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Britney Spears','@britneyspears',55926530)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Ariana Grande','@ArianaGrande',54933917)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Selena Gomez','@selenagomez',54086520)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('CNN Breaking News','@cnnbrk',53338092)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Demi Lovato','@ddlovato',51240758)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('jimmy fallon','@jimmyfallon',49600762)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Shakira','@shakira',49003521)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Jennifer Lopez','@JLo',43920263)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Donald J. Trump','@realDonaldTrump',42059327)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Bill Gates','@BillGates',40625960)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('The New York Times','@nytimes',40060483)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Oprah Winfrey','@Oprah',39683861)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Instagram','@instagram',39462618)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('LeBron James','@KingJames',39384135)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('CNN','@CNN',38312593)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Miley Ray Cyrus','@MileyCyrus',37497194)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Bruno Mars','@BrunoMars',36931391)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Drizzy','@Drake',36395505)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Narendra Modi','@narendramodi',36385879)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Niall Horan','@NiallOfficial',35857561)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('BBC Breaking News','@BBCBreaking',35637154)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('SportsCenter','@SportsCenter',35028352)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Neymar Jr','@neymarjr',34648744)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('ESPN','@espn',33719230)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Wiz Khalifa','@wizkhalifa',32452203)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Lil Wayne WEEZY F','@LilTunechi',31920073)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('One Direction','@onedirection',31800106)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Harry Styles','@Harry_Styles',31304873)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('P!nk','@Pink',31018100)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Shah Rukh Khan','@iamsrk',30052068)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Louis Tomlinson','@Louis_Tomlinson',29850489)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Liam','@LiamPayne',29263107)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Alicia Keys','@aliciakeys',29234855)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Adele','@Adele',28801751)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Neil Patrick Harris','@ActuallyNPH',27600066)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Real Madrid C.F','@realmadrid',27334077)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Emma Watson','@EmmaWatson',27151083)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('NASA','@NASA',26923055)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('NBA','@NBA',26773664)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Pitbull','@pitbull',26319011)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('zayn','@zaynmalik',25283305)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Khloé','@khloekardashian',25230381)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('FC Barcelona','@FCBarcelona',25226732)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Kendall','@KendallJenner',25078946)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Coldplay','@coldplay',24861472)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Chris Brown','@chrisbrown',24248626)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('NFL','@NFL',24246872)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('The Economist','@TheEconomist',22305232)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('David Guetta','@davidguetta',22028323)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('BBC News (World)','@BBCWorld',21725734)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Marshall Mathers','@Eminem',21685031)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Avril Lavigne','@AvrilLavigne',21404919)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('NICKI MINAJ','@NICKIMINAJ',21179322)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('President Trump','@POTUS',20963366)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('National Geographic','@NatGeo',20492038)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Ed Sheeran','@edsheeran',20409688)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Ricky Martin','@ricky_martin',19819691)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Andrés Iniesta','@andresiniesta8',19671231)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Hillary Clinton','@HillaryClinton',19608957)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Google','@Google',19216174)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('ashton kutcher','@aplusk',18858508)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Leonardo DiCaprio','@LeoDiCaprio',18786523)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Champions League','@ChampionsLeague',18751176)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Alejandro Sanz','@AlejandroSanz',18118235)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Snoop Dogg','@SnoopDogg',17684050)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Paulina Rubio','@paurubio',11508818)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Yuya','yuyacst',9800083)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Christina Aguilera','@xtina',16640234)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Fox News','@FoxNews',16338433)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('BEYONCÉ','@Beyonce',15153957)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Zac Efron','@ZacEfron',15010679)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Maroon 5','@maroon5',14832741)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Tom Hanks','@tomhanks',14537044)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Charlie Sheen','@charliesheen',12332934)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Nick Jonas','@nickjonas',12323278)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Dwayne Johnson','@TheRock',12124746)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Starbucks Coffe','@Starbucks',11906813)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('John Cena','@JohnCena',10462957)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Luis Fonsi','@LuisFonsi',9063800)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Ronaldinho Gaúcho','@10Ronaldinho',16310714)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('J.K. Rowling','@jk_rowling',13233837)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Sofia Vergara','@SofiaVergara',9339081)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Roger Federer','@rogerfederer',10352064)");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+") VALUES ('Papa Francisco','@Pontifex_es',14981867)");

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
