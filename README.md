# 🚀 Spring Boot DevOps Pipeline

[![Build Status](https://github.com/ArthurFiorin/SpringBoot-Devops-Pipeline/actions/workflows/maven.yml/badge.svg)](https://github.com/ArthurFiorin/SpringBoot-Devops-Pipeline/actions)

Projeto prático de DevOps focado na automação de ciclo de vida (CI/CD) e orquestração de containers.

## 🏗 Arquitetura do Sistema
O sistema é composto por uma API Java 21, conteinerizada e orquestrada, com uma stack completa de observabilidade para monitoramento de métricas.

## 🛠 Tecnologias Implementadas
- **Linguagem:** Java 21
- **CI/CD:** GitHub Actions
- **Orquestração:** Kubernetes (Manifestos declarativos)
- **Monitoramento:** Prometheus & Grafana
- **Banco de Dados:** PostgreSQL

## ⚙️ Funcionalidades Atuais
- **Pipeline Automatizada:** Build, teste e deploy contínuo configurados via GitHub Actions.
- **Infraestrutura Declarativa:** Configuração completa via arquivos YAML (Kubernetes).
- **Stack de Observabilidade:** Monitoramento de métricas do sistema com Prometheus integrado ao Grafana.
- **Gestão de Recursos:** Arquitetura otimizada para ser executável em ambientes locais com restrições de memória.

## 🚧 Roadmap (Próximos Passos)
- [ ] **Infraestrutura como Código (IaC):** Automatizar o provisionamento da infraestrutura (Terraform/Ansible).
- [ ] **Deploy em Nuvem Gerenciada:** Migrar o cluster local para um serviço gerenciado (EKS, GKE ou DOKS).
- [ ] **Service Mesh:** Implementação de Istio para controle de tráfego.
