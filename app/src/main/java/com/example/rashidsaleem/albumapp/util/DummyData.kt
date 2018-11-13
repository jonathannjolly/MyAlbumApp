package com.example.rashidsaleem.albumapp.util

import com.example.rashidsaleem.albumapp.R
import com.example.rashidsaleem.albumapp.model.Student
import com.example.rashidsaleem.albumapp.util.AppContants.*

class  DummyData {



      public fun GenerateStudentsData() : ArrayList<Student> {

        var studentArrayList: ArrayList<Student> = ArrayList<Student>()

        var socialMediaHashMap: HashMap<String, String> = HashMap<String, String>()

        socialMediaHashMap.put(SOCIAL_FACEBOOK, "baqar@gmail.com")
        socialMediaHashMap.put(SOCIAL_WHATS_APP, "+923473738298")
        socialMediaHashMap.put(SOCIAL_IMO, "+923473738298")
        socialMediaHashMap.put(SOCIAL_TWITTER, "baqar@gmail.com")



        studentArrayList.add(Student(1, "Abbas Yusuf Mohammad", R.mipmap.ab01, "+2348106456223", "Rigachikun Kaduna State.", socialMediaHashMap, "Never take life too seriously because, You can't get out of it alive, concentrate on building your relationship with Allah." ))
        studentArrayList.add(Student(2, "Abdullahi Ahmed Talba", R.mipmap.ab02, "+2348069732340", "Army Barrack Potiskum, Yobe State.", socialMediaHashMap, "Wealth is created with mind not only resources." ))
        studentArrayList.add(Student(3, "Abdullahi Muhammad", R.mipmap.ab03, "+2347036576333", "Old blind workshop Gombe Road Bauchi, Bauchi State.", socialMediaHashMap, "My mission in life is not merely to survive, but to thrive; and to do so with some passion, some compassion, some humour, and some style.-KAUCHI." ))
        studentArrayList.add(Student(4, "Abubakar Bello Adamu", R.mipmap.ab04, "+2348061210161", "High-level Ashaka, Gombe State.", socialMediaHashMap, "No evil done to a man by man shall go unfurnished, for every evil done to a man by man shall be redress if not by man surely by god, for the victory of evil over good is just temporary." ))
        studentArrayList.add(Student(5, "Abubakar Sadiq Muhammad", R.mipmap.ab05, "+2348160750058", "Isa yuguda guest house Bauchi State.", socialMediaHashMap, "Best days are still ahead." ))
        studentArrayList.add(Student(6, "Adamu Adamu Musa", R.mipmap.ad01, "+2348037262694", "No. S/12 Nass. Jah. Makama B Bauchi State.", socialMediaHashMap, "I see the human in everyone and everything. No one is more important than anyone else, I still hang out with my school friends I belong to every body." ))
        studentArrayList.add(Student(7, "Ademu Ohemu James", R.mipmap.ad02, "+2348163553621", "13, Arobadade Street bariga lagos state.", socialMediaHashMap, "Makes humility to be your priority." ))
        studentArrayList.add(Student(8, "Ahmad Abubakar Sadeeq", R.mipmap.ah01, "+2348034525563", "NO.16 Sokoto Road G.R.A Bauchi.", socialMediaHashMap, "Losers quit when they fail, winners fail until they succeed." ))
        studentArrayList.add(Student(9, "Ahmad Aisha Laushi", R.mipmap.ah02, "+2348033432015", "Sir Kashim Ibrahim street, Bauchi State.", socialMediaHashMap, "Ya hayyu ya qayyumu." ))
        studentArrayList.add(Student(10, "Ahmed Yusuf", R.mipmap.ah03, "+2347031877915", "Katsina state.", socialMediaHashMap, "At the end of the day, life is about being happy being who you are, and I feel like we are so blessed to have the support system and the best family to really just support each other no matter what we're going through." ))
        studentArrayList.add(Student(11, "Aisha Ahmad Usman", R.mipmap.ai01, "+2347010511001", "GRA Bauchi State.", socialMediaHashMap, "If it doesn't affect your pay, don't let it affect your day." ))
        studentArrayList.add(Student(12, "Aisha Ismail Abubakar", R.mipmap.ai02, "+2348162557868", "No.109/9 Bauchi road Jos Plateau State.", socialMediaHashMap, "Always do your best, what you plant now, you will harvest later." ))
        studentArrayList.add(Student(13, "Aliyu Usman Muhammad", R.mipmap.al01, "+2347037543632", "No 13 makama dutsen tanshi,Bauchi state.", socialMediaHashMap, "You are educated. Your certification is in your degree. You may think of it as the ticket to the good life. Let me ask you to think of an alternative. Think of it as your ticket to change the world.." ))
        studentArrayList.add(Student(14, "Anas Aliyu Abba", R.mipmap.an01, "+2347063538791", "Jos, Plateau State.", socialMediaHashMap, "It pays to be patient." ))
        studentArrayList.add(Student(15, "Anas Isa Abdullahi", R.mipmap.an02, "+2347069538759", "Birshin Fulani Bauchi state", socialMediaHashMap, "Distance don't separate people but silence does." ))
        studentArrayList.add(Student(16, "Bappah Sulaiman Aliyu", R.mipmap.ba01, "+2348065344903", "No2 Dorawan Road Old GRA Bauchi state", socialMediaHashMap, "Life is a divine chaos that has an infinite ends, so live it fully and humbly." ))
        studentArrayList.add(Student(17, "Besango Samuel Bekilo", R.mipmap.be01, "+2347037391001", "Yelwan tudu, behind Elim Church Bauchi state", socialMediaHashMap, "Do to others what you will have them do to you." ))
        studentArrayList.add(Student(18, "Bilkisu Abdulkadir Mijinyawa", R.mipmap.bi01, "+2348061353640", "No 54 B/kura street Bauchi state", socialMediaHashMap, "Alhamdulillahi Ala kulli shay'in...." ))
        studentArrayList.add(Student(19, "Dahiru Yakubu Hussaini", R.mipmap.da01, "+2347060685463", "Tudun wada/Kano State", socialMediaHashMap, "You are educated. Your certification is in your degree. You may think of it as the ticket to the good life. Let me ask you to think of an alternative. Think of it as your ticket to change the world." ))
        studentArrayList.add(Student(20, "Danjuma Andrew", R.mipmap.da02, "+2348088737536", "Bulunkuju, Abuja ward, Maiduguri, Borno state", socialMediaHashMap, "Do to others what you wish upon yourself, just save humanity." ))
        studentArrayList.add(Student(21, "Demba Hannatu", R.mipmap.de01, "+2348029068029", "Tumfure Quarters Gombe State", socialMediaHashMap, "...The end of a matter is better than its beginning, and patience is better than pride...." ))
        studentArrayList.add(Student(22, "Emmanuel Arome Agbo", R.mipmap.em01, "+2348060677705", "Kaduna state", socialMediaHashMap, "Not everything that counts can be counted and not everything that's counted truly counts." ))
        studentArrayList.add(Student(23, "Emmanuel Idoko Aba", R.mipmap.em02, "+2347035998951", "Brigade quarters Kano State", socialMediaHashMap, "Tomorrow is a picture scraped in a smile." ))
        studentArrayList.add(Student(24, "Ezrah Daniel Ya'u", R.mipmap.ez01, "+2347066079689", "Rafin zurfi yelwa bauchi,Bauchi state", socialMediaHashMap, "I see more clearly through my heart." ))
        studentArrayList.add(Student(25, "Fa'iza Mustapha", R.mipmap.fa01, "+2348030715586", "Sharada Ja’en Kano, Kano State.", socialMediaHashMap, "It is better to be hated for what  you are than to be loved for what you are not." ))
        studentArrayList.add(Student(26, "Fatima Ya'u Muhammad", R.mipmap.fa02, "+2348060789655", "Makama s 21 jahun Bauchi state", socialMediaHashMap, "It is better to be hated for what  you are than to be loved for what you are not." ))
        studentArrayList.add(Student(27, "Fausat Yekini", R.mipmap.fa03, "+2347032863382", "Yelwa Tudun, Bauchi state", socialMediaHashMap, "Wherever life plants you, bloom with grace." ))
        studentArrayList.add(Student(28, "Gidado Ismail Bello", R.mipmap.gi01, "+2347038179730", "D/Tanshi, D/goje street BH.", socialMediaHashMap, "Don't be scared to be ambitious. It's not a humiliation to have a high target and to fail. For me, the real humiliation is to have a target and not to give everything to reach it." ))
        studentArrayList.add(Student(29, "Goje Suleiman Bitrus", R.mipmap.go01, "+2347060537372", "Sabon layi opp corpers lodge along bank road T/balewa LGA Bauchi state.", socialMediaHashMap, "Better than a thousand days of a diligent search it's one day with a great teacher...." ))
        studentArrayList.add(Student(30, "Hamza Ibrahim Danasabe", R.mipmap.ha01, "+2348037856962", "No.10 shekh Dahiru street Bauchi state", socialMediaHashMap, "say:Lo!my worship and my sacrifice and my living and my dying are for Allah, Load of the world- (Quran 6:162)." ))
        studentArrayList.add(Student(31, "Hanafi Shehu Adamu", R.mipmap.ha02, "+2348032860438", "Ribina, Toro Bauchi state", socialMediaHashMap, "Simplicity is the best option for those who want success in life." ))
        studentArrayList.add(Student(32, "Hauwa Kabir Lele", R.mipmap.ha03, "+2347061680265", "Fadaman Mada Bh opposite Miyatti Allah, Bauchi state", socialMediaHashMap, "You can do anything but not everything." ))
        studentArrayList.add(Student(33, "Idris Muhammed Bello", R.mipmap.id01, "+2347063234804", "Unguwan chiroma gwaram,alkaleri,Bauchi state", socialMediaHashMap, "Alhamdulillah." ))
        studentArrayList.add(Student(34, "Isah Abdullahi Asthiamady", R.mipmap.is01, "+2348160651582", "177 guards battalion, Shittu  Aloa  barracks keffi, Nasarawa state.", socialMediaHashMap, "Life is not how far but how when. Use your brain to play d game not feel d pain." ))
        studentArrayList.add(Student(35, "Ismail Idris Abdullahi", R.mipmap.is02, "+2347067788503", "Jos North Plateau State", socialMediaHashMap, "Outer changes always begins with an inner change of character." ))
        studentArrayList.add(Student(36, "Jamilu Adamu", R.mipmap.ja01, "+2348035571745","Dass LGA, Bauchi State", socialMediaHashMap, "Don't raise your voice, improve your argument." ))
        studentArrayList.add(Student(37, "Jessica Jinkiri", R.mipmap.je01, "+2347065757038", "Dashik,Dadinkowa Jos, Plateau state.", socialMediaHashMap, "Be yourself; everyone else is already taken.The fears we don't face become our limits.." ))
        studentArrayList.add(Student(38, "Jonathan Jolly", R.mipmap.jo01, "+2348034268220", "No.2 Ung. Mission street, Karim Lamido LGA, Taraba State", socialMediaHashMap, "Nothing good comes easy." ))
        studentArrayList.add(Student(39, "Jonathan O. Idoko", R.mipmap.jo02, "+2347032502417", "No 26b Rice mill Road, Otukpo, Benue State.", socialMediaHashMap, "The difficulties and struggles of today are the price that must be paid for the accomplishment and victories of tomorrow...." ))
        studentArrayList.add(Student(40, "Lukman Alhassan", R.mipmap.lu01, "+2347035189650", "Tafawa Balewa Bauchi state", socialMediaHashMap, "Death is not the greatest loss in life. The greatest loss is what dies inside us while we live." ))
        studentArrayList.add(Student(41, "Maitaru Sunusi Aminu", R.mipmap.ma01, "+2347065388107", "No_05 Ibb Way Sarkin Kasuwa Street Ibi LGA, Taraba State", socialMediaHashMap, "You can't go back and start a new beginning, but you can start now and make a new ending." ))
        studentArrayList.add(Student(42, "Maryam Yunusa Ibrahim", R.mipmap.ma02, "+2347064787050", "Farawa maiduguri road Kano state", socialMediaHashMap, "It pays to be patience." ))
        studentArrayList.add(Student(43, "Minayimbe John", R.mipmap.mi01, "+2347031183477", "Yelwa Kagadama, Bauchi state", socialMediaHashMap, "All things worketh for good to them that loves God.." ))
        studentArrayList.add(Student(44, "Misbahu Yunusa Yusuf", R.mipmap.mi02, "+2348130781117", "2/1 New Site Kubwa, Abuja.", socialMediaHashMap, "I don't look what I am." ))
        studentArrayList.add(Student(45, "Mubarakat Mustapha", R.mipmap.mu01, "+2349034981763", "Federal polytechnic, gwallameji, Bauchi state", socialMediaHashMap, "It is better to be hated for what  you are than to be loved for what you are not." ))
        studentArrayList.add(Student(46, "Mubaraq Sani Ahmad", R.mipmap.mu02, "+2348028088962", "Old G.R.A  opposite judges quarters, Bauchi state", socialMediaHashMap, "A destiny can only be delayed but it can never be denied." ))
        studentArrayList.add(Student(47, "Muhammad Ibrahim Muhd", R.mipmap.mu03, "+2348061161691", "Maiduguri, Borno state", socialMediaHashMap, "Life is what happens to us while we are making other plans." ))
        studentArrayList.add(Student(48, "Muhammad Saifuddeen Adamu", R.mipmap.mu04, "+2348101024005", "Baffajo road no 6 yelwan tudu Bauchi state", socialMediaHashMap, "Coins always make sounds but the currency  notes are always silent,so when your value increase keep quiet." ))
        studentArrayList.add(Student(49, "Muhammad Yahaya Umar", R.mipmap.mu05, "+2347069556005", "Funakaye Local Government Area, Bajoga, Gombe state", socialMediaHashMap, "We spend our whole lives worrying about the future, plannning for the future, trying to predicts the future, as if figuring it out will cushion the blow. But the future is always changing. The future is the home of our deepest fears and wildest hopes. But one thing is certain when it finally reveals itself. The future is never the way we imagined it. May Allah protect us here in duniya and in the hereafter!!." ))
        studentArrayList.add(Student(50, "Muhammad Hardo Bello", R.mipmap.mu06, "+2348063435919", "17 House Nahuta Potiskum, Yobe State.", socialMediaHashMap, "Only future can tell." ))
        studentArrayList.add(Student(51, "Musbahu Buhari", R.mipmap.mu07, "+2347066340818", "Sabon pegi opposite government house damaturu Yobe state", socialMediaHashMap, "School may be hard, annoying, and irritating. But admit it, you're going to miss it when it ends." ))
        studentArrayList.add(Student(52, "Nafeesah Musa Dauda", R.mipmap.na01, "+2348104396967", "Nw extension,Kaduna state", socialMediaHashMap, "Love of Allah is a facet of sincerity of one's belief in him." ))
        studentArrayList.add(Student(53, "Nafiu Shehu", R.mipmap.na02, "+2348038594926", "Bauchi road, jos, plateau state", socialMediaHashMap, "La ilaha illallahu, Muhammadur rasulullah (SAW)." ))
        studentArrayList.add(Student(54, "Rashida Ishaq Adam", R.mipmap.ra01, "+2348032161837", "Tilden Fulani Toro local government, Bauchi state", socialMediaHashMap, "I'm a very patient person and i give plenty of second chances but i am not a saint. I do have my limits." ))
        studentArrayList.add(Student(55, "Rashidat Olawunmi Abubakar", R.mipmap.ra02, "+2347061971540", "Unity Avenue, Lasu-Isheri Road, Igando, Lagos State.", socialMediaHashMap, "When life deals you more than you can stand, just kneel (Pray)....." ))
        studentArrayList.add(Student(56, "Salam Khalid Oladapo", R.mipmap.sa01, "+2348053938228", "Alara's house, ogbomosho north local government, Oyo state.", socialMediaHashMap, "Doing good for a good done is simply repayment, whereas doing good for an evil done to you is a tremendous virtue." ))
        studentArrayList.add(Student(57, "Salim Abdulsalam Abdullahi", R.mipmap.sa02, "+2347061359871", "CA4 yerima road, kinkinau GRA,  Kaduna state.", socialMediaHashMap, "La ilaha illallahu, Muhammadur rasulullah (SAW)." ))
        studentArrayList.add(Student(58, "Salisu Muhammad Musa", R.mipmap.sa03, "+2348032340735", "Jos-North, Plateau State.", socialMediaHashMap, "Goodbye is the saddest i hate to say, but saying it doesnt mean we wouldn't meet again. Only God Knows." ))
        studentArrayList.add(Student(59, "Samaila Salisu Dauya", R.mipmap.sa04, "+2348064860962", "Commissioners quarters maiduguri road damaturu Yobe state", socialMediaHashMap, "So many books, so little time." ))
        studentArrayList.add(Student(60, "Sarah Garba", R.mipmap.sa05, "+2347030235480", "Km No.3 Maiduguri road galloji qtrs tirwun Bauchi State", socialMediaHashMap, "Don’t look down on others coz anybody can come up." ))
        studentArrayList.add(Student(61, "Shamsuddeen Aminu Muhammad", R.mipmap.sh01, "+2348130694796", "Unguwan jaki street Bauchi state.", socialMediaHashMap, "Alhamdulilah." ))
        studentArrayList.add(Student(62, "Simbiat Folashade Haruna", R.mipmap.si01, "+2348096229862", "Opposite NNPC depot maje, suleja Niger State.", socialMediaHashMap, "If you can't explain it simply, you don't understand it well enough.." ))
        studentArrayList.add(Student(63, "Sulaiman Muhammad Ibrahim", R.mipmap.su01, "+2348065894747", "Federal Lowcost, New Extension Near Salima Bread Bauchi, Bauchi State.", socialMediaHashMap, "In Life Nothing Comes Easy." ))
        studentArrayList.add(Student(64, "Suleiman Yau", R.mipmap.su02, "+2348037425267", "M. A Street Fadaman Mada, Bauchi state.", socialMediaHashMap, "The Dunya is not a resting place, it is the testing place.." ))
        studentArrayList.add(Student(65, "Sumi Iliya", R.mipmap.su03, "+2348133124236", "New Muazu layout, close to Christain Cemetery, rafin zurfi-Bauchi state.", socialMediaHashMap, "All blessings come to us through God. He will teach us, for in beholding His life we find that He is the best." ))
        studentArrayList.add(Student(66, "Theophilus Adamu Kyauta", R.mipmap.th01, "+2347066165673", "No.5 Prof. Sambo Street, adj. customs office, yelwa tudu, Bauchi state.", socialMediaHashMap, "You don't have to lose to lose and you don't have to win to win." ))
        studentArrayList.add(Student(67, "Thomas Lumana Mbami", R.mipmap.th02, "+2347086888569", "Rafin Gimba, Tafawa Balewa, Bauchi state.", socialMediaHashMap, "Learn as if you will live forever and live like you will die tommorrow.." ))
        studentArrayList.add(Student(68, "Umar Bello", R.mipmap.um01, "+2348034699756", "Alhasawa quarters, Kurna. Dala LGA, Kano state.", socialMediaHashMap, "There was a time when we use tell our friend's let's meet and plan something and we say let's plan and meet some day, that's how the life change.. When something nothing nothing happening,that's something can happen." ))
        studentArrayList.add(Student(69, "Umar Faruk Abba", R.mipmap.um02, "+2348065874613", "Gamawa/Bauchi State.", socialMediaHashMap, "Alhamdulilah." ))
        studentArrayList.add(Student(70, "Ummulaiman M. Magaji", R.mipmap.um03, "+2347933112713", "Tambari housing estate, Bauchi state.", socialMediaHashMap, "I luv islam.." ))
        studentArrayList.add(Student(71, "Usman Dodo Ismail", R.mipmap.us01, "+2347066149236", "Along musa kyashi street bolari West Gombe state.", socialMediaHashMap, "Falillahil hamdu..." ))
        studentArrayList.add(Student(72, "Yahaya M. Maigwaram", R.mipmap.ya01, "+2347061674731", "Atiku abubakar street gwallaga Bauchi state.", socialMediaHashMap, "Together we can make it.." ))
        studentArrayList.add(Student(73, "Yunusa Muhammad", R.mipmap.yu01, "+2347033514431", "Isah kaita street, Hausawa zoo road kano, Kano state.", socialMediaHashMap, "Astagafurullah." ))
        studentArrayList.add(Student(74, "Yusuf Abubakar", R.mipmap.yu02, "+2348138376452", "Unguwan Sarakuna Bauchi state", socialMediaHashMap, "Confidence without competence is ignorance." ))
        studentArrayList.add(Student(75, "Yusuf Nusirat Hamed", R.mipmap.yu03, "+2348165088096", "FGC Kano Staff Quarters. Opposite ungwa uku park. Yagba LGA, Kogi State.", socialMediaHashMap, "A meaningful silence is better than a meaningless words.." ))
        studentArrayList.add(Student(76, "Zaid Musa", R.mipmap.za01, "+2348067696964", "Bachirawa Gadar madugu Kano state.", socialMediaHashMap, "Trust unto God and he shall direct your paths." ))
        studentArrayList.add(Student(77, "Zalihatu Sale Ahmed", R.mipmap.za02, "+2348107807060", "Bauchi/Bauchi state.", socialMediaHashMap, "All our dreams can come true if we have the courage to pursue them.." ))
        studentArrayList.add(Student(78, "Zayyad Yakubu", R.mipmap.za03, "+2348037367768", "Katagum/Bauchi State.", socialMediaHashMap, "Success is walking from failure to failure with no loss of enthusiasm." ))


        return studentArrayList;
    }
}