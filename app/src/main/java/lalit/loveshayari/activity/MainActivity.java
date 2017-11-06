package lalit.loveshayari.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import lalit.loveshayari.R;

import static lalit.loveshayari.R.id.list;

public class MainActivity extends AppCompatActivity {
String [] data={"Batane ko jo bekarar hai wo bat batane do jara,\n" +
        "Mohabbat ka ikrar hume karne do jara,\n" +
        "Rakhenege tumhe apni jindgi apni jaan bana kar\n" +
        "Bas pyar ka izhaar karne do jara." ,
        "Aankho ki gehrai mein teri kho jana chahta hoon,\n" +
                "Aaj tujh bahon mein lekar so jana chahta hoon,\n" +
                "Tood kar hade mein aaj sari\n" +
                "Aapna tujh banana lena chahta hoon.." ,
        "Meri har khwahish tum ho,\n" +
                "Meri chahat mera pyar tum ho,\n" +
                "Tum samjh na pao shayed is baat ko\n" +
                "Par meri jindgi mere jeene ki wajha tum ho" ,
        "Ek chahat hai meri tumse pyari bat ho,\n" +
                "Jara jara khamosh ho or lambi rat ho,\n" +
                "Or fir os raat yhi batate rahe tum ko\n" +
                "Ki tum meri jindgi meri kainat ho" ,
        "Pyari teri bate mujh hasa deti hai,\n" +
                "Tujh se dooriya mujh saza deti hai,\n" +
                "Roshni banke aayi hai tu meri jindgi mein\n" +
                "Teri chahat teri wafa bata deti hai" ,
        "Meri jindgi tum se hai,\n" +
                "Itni mohabbat tum se hai,\n" +
                "Mangte rehte hai roj khuda se tum ko\n" +
                "Mujh itni chahat tum se.." ,
        "Bahon me chupa ke rakhu tujhko,\n" +
                "Seene se laga ke rakhu tujhko.\n" +
                "\n" +
                "Aao tum khawabo mein mere,\n" +
                "Or mein khawabo me sajsa ke rakhu tujhko.\n" +
                "\n" +
                "Jo hoti hai na kabhi khatam mohabbat,\n" +
                "Wesi mohabbat apni bana ke rakhu tujhko." ,
        "Adaon se teri mohabbat hai,\n" +
                "Nigahon se teri mohabbat hai.\n" +
                "\n" +
                "Tere hone se hi khush hai hum,\n" +
                "Itni tere ehsas se mohabbat hai.\n" +
                "\n" +
                "Bas samjh nhi aata bataon kese tujhko,\n" +
                "Mohabbat hai or kitni mohabbat hai tujh se." ,
        "Meri dhadkan tujh se hai,\n" +
                "Meri saanse tujh se hai,\n" +
                "Tere liye lad jao duniya se mein\n" +
                "Itni aashiqui tujh se hai…\n" +
                "\n" +
                "I Love You Jaan",
        "Dil se tujh apne laga loon,\n" +
                "Aa sanam tujh apna bana loon,\n" +
                "Kahi mujh ho na jaye deri\n" +
                "Aa tujh tujhse hi chura loon" ,
        "Tere khayalon mein khoya kuch aisa ho,\n" +
                "Ki sab kuch bhul jata hoo or pata nhi chalta,\n" +
                "Ki meri saanso se mein ho\n" +
                "Ya tere hone se meri saanse." ,
        "Meri aankho ka khwab bas tum ho,\n" +
                "Mere dil ka armaan bas tum ho,\n" +
                "Jeete hai hum bas tumhare sahare\n" +
                "Kyoki ager mein dil ho tu meri dhadkan bas tum ho" ,
        "Bepanaha mohabbat tum se milkar hoi,\n" +
                "Is mere dil ko khushi tum se mil kar hoi,\n" +
                "Paya sab kuch duniya mein maine\n" +
                "Per jeene mein khushi tumse mile kar hoi" ,
        "Jab se aye ho tum meri jindgi mein,\n" +
                "Hume khushi bepanha mili hai,\n" +
                "Tumse pa kar mohabbat had se jada\n" +
                "Hume jeene ki wajha mili hai" ,
        "Tujh palkon pe beetha ke rakhon mein,\n" +
                "kar ke had se jada pyar seene se laga ke rakhon mein,\n" +
                "Behad keemti ho tum mere liye\n" +
                "Tumhe dil mein chupa ke apni jaan bana ke rakhon mein." ,
        "Jo chahi thi mohabbat,\n" +
                "Wo mohabbat di hai tumne.\n" +
                "\n" +
                "Tham ke hath jindgi mein mera,\n" +
                "Bepanha khushi di hai tumne.\n" +
                "\n" +
                "Mujh pe luta ke pyar apna,\n" +
                "Ek pyar bhari jindgi di hai tumne" ,
        "Dhadkan meri Tumse hai,\n" +
                "aashiqui meri tumse hai,\n" +
                "bataye to kese bataye tum ko\n" +
                "Meri jindgi meri saanse tumse hai" ,
        "Chal aaj faslon ko mita dete hai,\n" +
                "Chal aaj dilo ko mila dete hai,\n" +
                "Banate hai ek pyar ki chadar\n" +
                "Or khud pe uda lete hai.",
"Dhadakte dil ki aawaj tum ho,\n" +
        "Sab se jaada kuch khass tum ho,\n" +
        "Har pal ehsaaa hota hai itna\n" +
        "Jese mere dil ke pass tum ho.","Muskaan Banke tere hothon pe aa jao,\n" +
        "Khawab Banke tere khayalon mein aa jao,\n" +
        "Ban ke aau khushbu mein karib tere\n" +
        "Or teri saanso se tere rag rag mein sama jao.","Na jaane kitne pyar se khuda ne banaya tumhe hoga,\n" +
        "Na jane kitni khubsurti ko lagaya hoga,\n" +
        "Jab bana ke didar kiya hoga tumhara\n" +
        "To usko bhi pyar jarur aya hoga","Meri har dhadkan mein jikar hai tumhara,\n" +
        "Meri har saans pe naam hai tumhara,\n" +
        "Tum base ho dil mein kuch aise\n" +
        "Ki har lamha ehsaas bas hota hai tumhara","Judai shene ki aadat nahi hai,\n" +
        "Bin tere rahne ki chahat nahi hai,\n" +
        "Chahat hai to sirf tere saath jeene ki\n" +
        "Bin tere jeene ki hamari koi khwahish nahi hai","Phoolo se jada khubsurat ho aap\n" +
        "Mohabbat se bhari murat ho aap\n" +
        "Kon kehta hai jeene ke liye saanse jaruri hai\n" +
        "Humare jeene ke liye to jarurat ho aap","Rutho gaye ager to mana hum lenge,\n" +
        "Jao gaye ager dur to utna karib aa hum lenge,\n" +
        "Mohabbat dil se ki hai\n" +
        "Shabdo se nhi jo bhula hum denge","Mohabbat Mujhe Thi Usi Se Sanam,\n" +
        "Yaadon Mein Uski Yeh Dil Tadpta Raha,\n" +
        "Maut Bhi Meri Chahat Ko Rok Na Saki,\n" +
        "Kabr Mein Bhi Yeh Dil Dhadkta Raha. ","Kai chehre lekar log yahan jiya karte hain,\n" +
        "Hum to bas ek hi chehre se pyar karte hain,\n" +
        "Na chupaya karo tum apne is chehre ko,\n" +
        "Kyuki hum ise hi dekh ke jiya karte hai.","Dil ka dard ek raaz banke reh gaya,\n" +
        "Mera bharosa mazak banke reh gaya,\n" +
        "Dilo ke saudagar se dillagi kar bethe,\n" +
        "Shayad is liye mera pyaar mazak ban ke reh gaya.","Meri Yaadon Mein Tum Ho Ya Mujh Mein Hi Tum Ho,\n" +
        "Mere Khwabon Mein Tum Ho Ya Mera Khwab Hi Tum Ho,\n" +
        "Dil Mera Dhadak Ke Puche Baar-Baar Ek Hi Baat,\n" +
        "Meri Jaan Mein Tum Ho Ya Meri Jaan Hi Tum Ho!","Kab Unki Palkon Se Izhaar Hoga,\n" +
        "Dil K Kisi Kone Mein Hamare Liye Pyar Hoga,\n" +
        "Guzar Rahi Hai Raat Unki Yaad Me,\n" +
        "Kabhi To Unko Bhi Hamara Intezar Hoga.","Husn ki ishq se jab jab baat hoti hai,\n" +
        "Mehfil mein unki baat se har baat hoti hai,\n" +
        "Wah kehte rahe koi baat nahin ham dono mein,\n" +
        "Par unki kahani se nai shuruat hoti hai.","Dil ko tha aapka besabri se intjaar,\n" +
        "palke bhi thi aap ki ek jhalak ko bekraar,\n" +
        "aap ke aane se aayi hai kuchh aisi bahar,\n" +
        "ki dil bas mange aapke liye khushiyan beshumar","Aapki yaad dil ko bekraar karti hai,\n" +
        "nazar talaash aapko bar-bar karti hai,\n" +
        "gila nahi jo aap door hain humse,\n" +
        "aapki to judaai bhi humse pyaar karti hai.","Ek tu teri aawaz yaad aayegi,\n" +
        "Teri kahi huwi har baat yaad aayegi,\n" +
        "Din dhal jayega raat yaad aayegi,\n" +
        "Har lamha pahli mulakat yaad aayegi.","Ek din jab hua pyar ka ahasaas unhe,\n" +
        "Wo saara din aakar hamare paas rote rahe,\n" +
        "Aur ham bhi itane khud garz nikale yaaron ki,\n" +
        "Aankhe band kar ke kafan mein sote rahe.","Jaane kya mujhse zamana chahta hai,\n" +
        "mere dil tod kar mujhe hasana chahta hai,\n" +
        "jaane kya baat jhalakti he mere chehre se,\n" +
        "har saks mujhe aazmana chahta hai. ","Socha yaad na kar ke thoda tadpau unko,\n" +
        "Kisi aur ka naam lekar jalau unko.\n" +
        "Par chot lagegi unko to dard mujhko hi hoga,\n" +
        "Ab ye batao kis tarah satau unko.","Pyar woh hum ko bepanah kar gaye\n" +
        "Phir zindgi mein hum ko tanha kar gaye\n" +
        "Chahat thi unke ishq mein Fanaah hone ki\n" +
        "Par woh laut kar aane ko bhi mana kar gaye.","Woh Khud Par Guroor Karte Hai,\n" +
        "To Isme Hairat Ki Koi Baat Nahi.\n" +
        "Jinhe Hum Chahte Hai,\n" +
        "Woh Aam Ho Hi Nahi Sakte."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView= (ListView) findViewById(list);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,data);
        listView.setAdapter(arrayAdapter);
        arrayAdapter.notifyDataSetChanged();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
