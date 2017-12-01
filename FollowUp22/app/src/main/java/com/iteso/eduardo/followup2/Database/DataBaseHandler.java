package com.iteso.eduardo.followup2.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Eduardo on 06/11/2017.
 */

public class DataBaseHandler extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "TwitterAccounts.db";
    private static final int DATABASE_VERSION=1;
    public static final String TABLE_USERS = "Users";
    private static DataBaseHandler dataBaseHandler;
    //columnas
    public static final String KEY_ID = "idUser";
    public static final String KEY_USERNAME ="usuario";
    public static final String KEY_NAME ="nombre";
    public static final String KEY_FOLLOWERS="followers";
    public static final String KEY_IMG ="imagenUrl";

    private DataBaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public static DataBaseHandler getInstance(Context context){
        if(dataBaseHandler==null){
            dataBaseHandler = new DataBaseHandler(context);

        }
        return dataBaseHandler;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE ="CREATE TABLE "+
                TABLE_USERS + " ("+KEY_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                KEY_NAME+" TEXT, "+ KEY_IMG+" TEXT, "+KEY_FOLLOWERS+" INTEGER, " + KEY_USERNAME +" TEXT )";
        db.execSQL(CREATE_TABLE);

        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Katy Perry','@katyperry',105966629,'https://pbs.twimg.com/profile_images/902653914465550336/QE3287ZJ_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Justin Bieber','@justinbieber',103038968,'https://pbs.twimg.com/profile_images/898295311893880832/bCps4HFV_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Barack Obama','@BarackObama',96641895,'https://pbs.twimg.com/profile_images/822547732376207360/5g0FC8XX_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Taylor Swift','@taylorswift13',85603369,'https://pbs.twimg.com/profile_images/900399601282424832/sNDnYYZe_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Rihanna','@rihanna',81688599, 'https://pbs.twimg.com/profile_images/906517174411579393/UfP8Fq6P_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Ellen DeGeneres','@TheEllenShow',75151736,'https://pbs.twimg.com/profile_images/932629572046090241/SPhaH9ab_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Lady Gaga','@ladygaga',73162808,'https://pbs.twimg.com/profile_images/933113770846457856/F2hGTtHf_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('YouTube','@YouTube',70336379,'https://pbs.twimg.com/profile_images/930116543899414533/Yc3hNq6J_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Justin Timberlake','@jtimberlake',63226913,'https://pbs.twimg.com/profile_images/829458458684461056/Tqk051Pu_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Cristiano Ronaldo','@Cristiano',63148348,'https://pbs.twimg.com/profile_images/913794143322804225/-yBKQ-3r_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Twitter','@Twitter',62045402,'https://pbs.twimg.com/profile_images/875087697177567232/Qfy0kRIP_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Kim Kardashian West','@KimKardashian',56766549,'https://pbs.twimg.com/profile_images/875432723837362176/j5NOs7Dj_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Britney Spears','@britneyspears',55926530,'https://pbs.twimg.com/profile_images/921395182049820674/S8HRYBHd_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Ariana Grande','@ArianaGrande',54933917,'https://pbs.twimg.com/profile_images/910720968305152001/DUogJANZ_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Selena Gomez','@selenagomez',54086520,'https://pbs.twimg.com/profile_images/922550343497478145/ti1FT2hp_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('CNN Breaking News','@cnnbrk',53338092,'https://pbs.twimg.com/profile_images/925092227667304448/fAY1HUu3_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Demi Lovato','@ddlovato',51240758,'https://pbs.twimg.com/profile_images/923629164644536320/PVpicW-n_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('jimmy fallon','@jimmyfallon',49600762,'https://pbs.twimg.com/profile_images/890035968656396288/nQU6aYAs_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Shakira','@shakira',49003521,'https://pbs.twimg.com/profile_images/922804076710154240/Js0PPO08_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Jennifer Lopez','@JLo',43920263,'https://pbs.twimg.com/profile_images/928849734349017089/TtexF0TP_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Donald J. Trump','@realDonaldTrump',42059327,'https://pbs.twimg.com/profile_images/874276197357596672/kUuht00m_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Bill Gates','@BillGates',40625960,'https://pbs.twimg.com/profile_images/929933611754708992/ioSgz49P_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('The New York Times','@nytimes',40060483,'https://pbs.twimg.com/profile_images/905479981459013637/a6BbKh4k_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Oprah Winfrey','@Oprah',39683861,'https://pbs.twimg.com/profile_images/771885422834098176/c5_Nj8j4_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Instagram','@instagram',39462618,'https://pbs.twimg.com/profile_images/786681705981673472/T5OKNZ1-_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('LeBron James','@KingJames',39384135,'https://pbs.twimg.com/profile_images/748603714705952768/-8HcqbKS_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('CNN','@CNN',38312593,'https://pbs.twimg.com/profile_images/508960761826131968/LnvhR8ED_400x400.png')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Miley Ray Cyrus','@MileyCyrus',37497194,'https://pbs.twimg.com/profile_images/913604968199966720/m0RYWHZR_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Bruno Mars','@BrunoMars',36931391,'https://pbs.twimg.com/profile_images/799472893612593152/rBf0ZufX_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Drizzy','@Drake',36395505,'https://pbs.twimg.com/profile_images/563843814725402624/Vb8k670S_400x400.png')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Narendra Modi','@narendramodi',36385879,'https://pbs.twimg.com/profile_images/718314968102367232/ypY1GPCQ_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Niall Horan','@NiallOfficial',35857561,'https://pbs.twimg.com/profile_images/908545940948115459/JGM3RNOF_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('BBC Breaking News','@BBCBreaking',35637154,'https://pbs.twimg.com/profile_images/875701863957630977/KTviCCaU_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('SportsCenter','@SportsCenter',35028352,'https://pbs.twimg.com/profile_images/875363787867652096/JVsTbdmb_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Neymar Jr','@neymarjr',34648744,'https://pbs.twimg.com/profile_images/907721243138424832/cLPYPDvd_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('ESPN','@espn',33719230,'https://pbs.twimg.com/profile_images/903763131872288768/lR7-Fb1N_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Wiz Khalifa','@wizkhalifa',32452203,'https://pbs.twimg.com/profile_images/929456188848144384/VPxYuQLP_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Lil Wayne WEEZY F','@LilTunechi',31920073,'https://pbs.twimg.com/profile_images/712863751/lil-wayne-gq-2_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('One Direction','@onedirection',31800106,'https://pbs.twimg.com/profile_images/665127003755032577/4y9RjRgE_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Harry Styles','@Harry_Styles',31304873,'https://pbs.twimg.com/profile_images/852489294102974465/4ew6HxaY_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('P!nk','@Pink',31018100,'https://pbs.twimg.com/profile_images/901285790667251712/Rckluz7j_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Shah Rukh Khan','@iamsrk',30052068,'https://pbs.twimg.com/profile_images/661679664/keep_it_onn_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Louis Tomlinson','@Louis_Tomlinson',29850489,'https://pbs.twimg.com/profile_images/846085533327654913/OkB6qyHl_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Liam','@LiamPayne',29263107,'https://pbs.twimg.com/profile_images/919885109028904960/0zlg5gqv_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Alicia Keys','@aliciakeys',29234855,'https://pbs.twimg.com/profile_images/784235369906614272/IyyZ25fR_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Adele','@Adele',28801751,'https://pbs.twimg.com/profile_images/657199367556866048/EBEIl2ol_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Neil Patrick Harris','@ActuallyNPH',27600066,'https://pbs.twimg.com/profile_images/794749304003039232/I1wn8Awo_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Real Madrid C.F','@realmadrid',27334077,'https://pbs.twimg.com/profile_images/855073776215654400/oGEOJ2JU_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Emma Watson','@EmmaWatson',27151083,'https://pbs.twimg.com/profile_images/832577643396612097/bgWfZsnE_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('NASA','@NASA',26923055,'https://pbs.twimg.com/profile_images/188302352/nasalogo_twitter_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('NBA','@NBA',26773664,'https://pbs.twimg.com/profile_images/921248739746033665/cjBVcCJG_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Pitbull','@pitbull',26319011,'https://pbs.twimg.com/profile_images/815974909398511616/jri8SoH9_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('zayn','@zaynmalik',25283305,'https://pbs.twimg.com/profile_images/903620229548224513/yRngHH9D_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Khloé','@khloekardashian',25230381,'https://pbs.twimg.com/profile_images/878146243448393729/OvDNzqji_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('FC Barcelona','@FCBarcelona',25226732,'https://pbs.twimg.com/profile_images/899584358041956353/LpYAYxjB_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Kendall','@KendallJenner',25078946,'https://pbs.twimg.com/profile_images/919067972525637632/srrsyiD2_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Coldplay','@coldplay',24861472,'https://pbs.twimg.com/profile_images/876385108961497088/eQL7OlX3_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Chris Brown','@chrisbrown',24248626,'https://pbs.twimg.com/profile_images/921237320493236224/lxG20zJl_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('NFL','@NFL',24246872,'https://pbs.twimg.com/profile_images/925044052831100929/VyOmvwSg_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('The Economist','@TheEconomist',22305232,'https://pbs.twimg.com/profile_images/879361767914262528/HdRauDM-_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('David Guetta','@davidguetta',22028323,'https://pbs.twimg.com/profile_images/876876286605635584/AphedJAV_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('BBC News (World)','@BBCWorld',21725734,'https://pbs.twimg.com/profile_images/875702138680246273/BfQLzf7G_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Marshall Mathers','@Eminem',21685031,'https://pbs.twimg.com/profile_images/929030268043845633/ilS1ri2v_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Avril Lavigne','@AvrilLavigne',21404919,'https://pbs.twimg.com/profile_images/585608696094396416/LbQL1HS1_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('NICKI MINAJ','@NICKIMINAJ',21179322,'https://pbs.twimg.com/profile_images/892500272324501505/pNvofNQb_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('President Trump','@POTUS',20963366,'https://pbs.twimg.com/profile_images/859982100904148992/hv5soju7_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('National Geographic','@NatGeo',20492038,'https://pbs.twimg.com/profile_images/921336759979597825/VTSJ5mRt_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Ed Sheeran','@edsheeran',20409688,'https://pbs.twimg.com/profile_images/819500159365160960/AOneM0y3_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Ricky Martin','@ricky_martin',19819691,'https://pbs.twimg.com/profile_images/913487560684462080/XanifhEw_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Andrés Iniesta','@andresiniesta8',19671231,'https://pbs.twimg.com/profile_images/378800000294054940/9636f1fa6c37c9d5b34c44f4d5712014_400x400.jpeg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Hillary Clinton','@HillaryClinton',19608957,'https://pbs.twimg.com/profile_images/839938827837976576/leN1zJJx_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Google','@Google',19216174,'https://pbs.twimg.com/profile_images/839721704163155970/LI_TRk1z_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('ashton kutcher','@aplusk',18858508,'https://pbs.twimg.com/profile_images/882152508134739968/8vihmn9W_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Leonardo DiCaprio','@LeoDiCaprio',18786523,'https://pbs.twimg.com/profile_images/694662257586892802/mdc5ELjj_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Champions League','@ChampionsLeague',18751176,'https://pbs.twimg.com/profile_images/616969183948054528/mF1Oxcly_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Alejandro Sanz','@AlejandroSanz',18118235,'https://pbs.twimg.com/profile_images/912805333923504128/8i_5os8X_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Snoop Dogg','@SnoopDogg',17684050,'https://pbs.twimg.com/profile_images/918966249190653952/bLz6sx7X_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Paulina Rubio','@paurubio',11508818,'https://pbs.twimg.com/profile_images/792007177313488897/0IkZhitI_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Yuya','@yuyacst',9800083,'https://pbs.twimg.com/profile_images/917416472175087621/jTTXIRu4_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Christina Aguilera','@xtina',16640234,'https://pbs.twimg.com/profile_images/929083759592316933/77AnEkq__400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Fox News','@FoxNews',16338433,'https://pbs.twimg.com/profile_images/918480715158716419/4X8oCbge_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('BEYONCÉ','@Beyonce',15153957,'https://pbs.twimg.com/profile_images/724054682579161088/3GgLeR65_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Zac Efron','@ZacEfron',15010679,'https://pbs.twimg.com/profile_images/700584804966752257/949bC_nn_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Maroon 5','@maroon5',14832741,'https://pbs.twimg.com/profile_images/915984426609156097/chaR6Zb5_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Tom Hanks','@tomhanks',14537044,'https://pbs.twimg.com/profile_images/280455139/l_ecdf8f7aa81d5163129fee54d83a5e63_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Charlie Sheen','@charliesheen',12332934,'https://pbs.twimg.com/profile_images/751591861127491584/l1swjFY4_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Nick Jonas','@nickjonas',12323278,'https://pbs.twimg.com/profile_images/907982679999574016/llcTo6_z_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Dwayne Johnson','@TheRock',12124746,'https://pbs.twimg.com/profile_images/3478244961/01ebfc40ecc194a2abc81e82ab877af4_400x400.jpeg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Starbucks Coffe','@Starbucks',11906813,'https://pbs.twimg.com/profile_images/877601376464904192/b3jangc1_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('John Cena','@JohnCena',10462957,'https://pbs.twimg.com/profile_images/877958014736756736/3Fba7ZkZ_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Luis Fonsi','@LuisFonsi',9063800,'https://pbs.twimg.com/profile_images/855417600683130880/Cb1UdSER_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Ronaldinho Gaúcho','@10Ronaldinho',16310714,'https://pbs.twimg.com/profile_images/817091464731693057/5RSuRSGK_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('J.K. Rowling','@jk_rowling',13233837,'https://pbs.twimg.com/profile_images/930493853769109505/CFfLdGgi_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Sofia Vergara','@SofiaVergara',9339081,'https://pbs.twimg.com/profile_images/751670051955060736/WCjXZvEg_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Roger Federer','@rogerfederer',10352064,'https://pbs.twimg.com/profile_images/833104478328877056/8z-8v1Fw_400x400.jpg')");
        db.execSQL("INSERT INTO "+TABLE_USERS+" ("+ KEY_NAME+","+KEY_USERNAME+","+ KEY_FOLLOWERS+","+ KEY_IMG+") VALUES ('Papa Francisco','@Pontifex_es',14981867,'https://pbs.twimg.com/profile_images/507819548834148352/jyx1JOS-_400x400.jpeg')");

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
