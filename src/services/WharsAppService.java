package services;

public interface WharsAppService {
    String greateWhatsappAccount(WhatSappUser whatsappUzers, List<Person>people);
    List<WhatSappUser>getWhatsappUzer();
    WhatSappUser getProfil(String pasword, List<WhatSappUser>whatsappUzers);
    String getMAssege(String password, String name, List<String> massege, List<WhatSappUser>uzers, List<WhatSappUser>uzers2);
}
