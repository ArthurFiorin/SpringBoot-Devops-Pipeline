# ☸️ Kubernetes Infrastructure

Este diretório contém todos os manifestos necessários para realizar o deploy da aplicação e da stack de monitoramento em um cluster Kubernetes.

## 📋 Visão Geral

A infraestrutura foi desenhada para garantir a escalabilidade da aplicação e a observabilidade do sistema. Os componentes incluem:

* **API**: O container principal da aplicação.
* **Networking**: Exposição via `Service` para acesso interno/externo.
* **Configuração**: Gerenciamento de parâmetros via `ConfigMap` e credenciais sensíveis via `Secret`.
* **Observabilidade**: Stack de monitoramento completa com **Prometheus** (coleta) e **Grafana** (visualização).

---

## 🏗️ Arquitetura

O fluxo de implantação e monitoramento é estruturado da seguinte forma:



1. **Aplicação**: `API Container` → `Deployment` → `Service` → `Kubernetes Cluster`.
2. **Monitoramento**: `Prometheus` (coleta de métricas) → `Grafana` (dashboards e alertas).

---

## ⚠️ Requisitos de Sistema (Atenção)

A stack de monitoramento (**Prometheus + Grafana**) é robusta, mas demanda recursos. Se estiver utilizando ambientes locais (Minikube, Kind, Docker Desktop), certifique-se de alocar **no mínimo 4GB de RAM** para o cluster.

> **Dica**: Caso note lentidão ou instabilidade no seu ambiente de desenvolvimento, você pode remover a pasta `monitoring/` temporariamente para economizar recursos.

---

## 🚀 Como fazer o Deploy

### Pré-requisitos
* `kubectl` configurado e com acesso ao cluster.
* Cluster Kubernetes ativo e rodando.

Verifique a conexão:
```bash
kubectl cluster-info
Passo 1: Configurações e Credenciais
Aplique os arquivos de configuração base:

Bash
kubectl apply -f configmap.yaml
kubectl apply -f secret.yaml
Verifique a criação:

Bash
kubectl get configmaps
kubectl get secrets
Passo 2: Deploy da Aplicação
Suba a lógica principal do sistema:

Bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
Verifique o status:

Bash
kubectl get pods
kubectl get services
Passo 3: Stack de Monitoramento
Para habilitar a observabilidade, aplique o diretório de monitoramento:

Bash
kubectl apply -f monitoring/
Isso irá provisionar automaticamente o Prometheus, o Grafana e os serviços necessários para a integração.

🩺 Verificação
Após concluir as etapas, certifique-se de que todos os componentes estão em execução:

Bash
kubectl get pods -n <seu-namespace-se-houver>