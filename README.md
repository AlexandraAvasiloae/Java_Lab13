##PA Lab 13

#Compulsory(1p)
#Team: Avasiloae Alexandra + Petrescu Bianca
```

Create a package with the name res. Inside this package create the files: Messages.properties, Messages_ro.properties.

    #Messages.properties file
    
    prompt = Input command:
    locales = The available locales are:
    locale.set = The current locale is {0}
    info = Information about {0}:
    invalid = Unknown command
    
        
    #Messages_ro.properties file
    
    prompt = Comanda ta:
    locales = Localizarile disponibile sunt:
    locale.set = Localizarea curenta este {0}
    info = Informatii despre localizarea {0}:
    invalid = Comanda necunoascuta

Create the package com and implement the following classes describing commands:
    DisplayLocales: to display all available locales
    SetLocale: to set the application current locale.
    Info: to display informations about the current or a specific locale.
    
When the user sets a specific language tag, various information obtained using standard Java classes such as Currency or DateFormatSymbols should be displayed in a text area, as in the following example:
    Country: Romania (România)
    Language: Romanian (română)
    Currency: RON (Romanian Leu)
    Week Days: luni, marţi, miercuri, joi, vineri, sâmbătă, duminică
    Months: ianuarie, februarie, martie, aprilie, mai, iunie, iulie, august, septembrie, octombrie, noiembrie, decembrie
    Today: May 8, 2016 (8 mai 2016)
    
Create the package app and the main class LocaleExplore. Inside this class, read commands from the keyboard and execute them.
All the locale-sensitive information should be translated in at least two languages (english-default and romanian), using the resource files.


    ALL TASKS DONE!
    
    OUTPUT:

    info
    Country: Romania (România)
    Language: Romanian (română)
    Currency: RON (Romanian Leu)
    Week Days: duminică, luni, marţi, miercuri, joi, vineri, sâmbătă
    Months: ianuarie, februarie, martie, aprilie, mai, iunie, iulie, august, septembrie, octombrie, noiembrie, decembrie
    Today: May 31, 2021 (31 mai 2021)
    
    setlocale fr FR
    info
    Country: France (France)
    Language: French (français)
    Currency: EUR (euro)
    Week Days: dimanche, lundi, mardi, mercredi, jeudi, vendredi, samedi
    Months: janvier, février, mars, avril, mai, juin, juillet, août, septembre, octobre, novembre, décembre
    Today: May 31, 2021 (31 mai 2021)
    
        
    display locales
    
    ar_AE
    ar_JO
    ar_SY
    hr_HR
    fr_BE
    es_PA
    mt_MT
    es_VE
    bg
    zh_TW
    it
    ko
    uk
    lv
    da_DK
    es_PR
    vi_VN
    en_US
    sr_ME
    sv_SE
    es_BO
    en_SG
    ar_BH
    pt
    ar_SA
    sk
    ar_YE
    hi_IN
    ga
    en_MT
    fi_FI
    et
    sv
    cs
    sr_BA_#Latn
    el
    uk_UA
    hu
    fr_CH
    in
    es_AR
    ar_EG
    ja_JP_JP_#u-ca-japanese
    es_SV
    pt_BR
    be
    is_IS
    cs_CZ
    es
    pl_PL
    tr
    ca_ES
    sr_CS
    ms_MY
    hr
    lt
    es_ES
    es_CO
    bg_BG
    sq
    fr
    ja
    sr_BA
    is
    es_PY
    de
    es_EC
    es_US
    ar_SD
    en
    ro_RO
    en_PH
    ca
    ar_TN
    sr_ME_#Latn
    es_GT
    sl
    ko_KR
    el_CY
    es_MX
    ru_RU
    es_HN
    zh_HK
    no_NO_NY
    hu_HU
    th_TH
    ar_IQ
    es_CL
    fi
    ar_MA
    ga_IE
    mk
    tr_TR
    et_EE
    ar_QA
    sr__#Latn
    pt_PT
    fr_LU
    ar_OM
    th
    sq_AL
    es_DO
    es_CU
    ar
    ru
    en_NZ
    sr_RS
    de_CH
    es_UY
    ms
    el_GR
    iw_IL
    en_ZA
    th_TH_TH_#u-nu-thai
    hi
    fr_FR
    de_AT
    nl
    no_NO
    en_AU
    vi
    nl_NL
    fr_CA
    lv_LV
    de_LU
    es_CR
    ar_KW
    sr
    ar_LY
    mt
    it_CH
    da
    de_DE
    ar_DZ
    sk_SK
    lt_LT
    it_IT
    en_IE
    zh_SG
    ro
    en_CA
    nl_BE
    no
    pl
    zh_CN
    ja_JP
    de_GR
    sr_RS_#Latn
    iw
    en_IN
    ar_LB
    es_NI
    zh
    mk_MK
    be_BY
    sl_SI
    es_PE
    in_ID
    en_GB
    
    exit
    
    Process finished with exit code 0


```