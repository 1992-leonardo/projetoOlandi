package com.trade.megatronapi.service;

import com.trade.megatronapi.model.CoinList;
import java.util.List;

public class IntegracaoCoinServiceImp implements IntegracaoCoinService {

    @Override
    public List<CoinList> listaMoeda() {

        CoinGeckoApiClient client = new CoinGeckoApiClientImpl();

        List<CoinList> coinList = client.getCoinList();
        System.out.println(coinList);

        return coinList;
    }
}
