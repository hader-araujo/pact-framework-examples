package br.com.zup.pact.consumer.integration.service

import br.com.zup.pact.consumer.dto.BalanceDTO

interface AccountIntegrationService {
    fun getBalance(accountId: Int): BalanceDTO?
}